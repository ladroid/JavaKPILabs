import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.*;

public class MatchCounter implements Callable<Integer> {
    private File directory;
    private String keywoard;
    private Integer count;
    private final String prvt = "protected";

    public MatchCounter(File directory, String keywoard) {
        this.directory = directory;
        this.keywoard = keywoard;
    }

    private void replace(File file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "", oldtext = "";

            while((line = reader.readLine()) != null ) {
                oldtext += line + "\r\n";
            } reader.close();

            String replacing = oldtext.replaceAll(keywoard, prvt).replace("protected class", "public class");

            FileWriter writer = new FileWriter(file);
            writer.write(replacing);
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean search(File file) {
        try {
            Scanner in = new Scanner(file);
            boolean found = false;
            while(!found && in.hasNextLine()) {
                String line = in.nextLine();
                if(line.contains(keywoard)) {
                    found = true;
                    replace(file);
                }
            }
            in.close();
            return found;
        }
        catch (IOException e) {
            return false;
        }
    }

    @Override
    public Integer call() {
        count = 0;
        try {
            File[] files = directory.listFiles();
            ArrayList<Future<Integer>> results = new ArrayList();
            ExecutorService service = Executors.newSingleThreadExecutor();
            for (File file : files) {
                if (file.isDirectory()) {
                    MatchCounter counter = new MatchCounter(file, keywoard);
                    //FutureTask task = new FutureTask(counter);

                    Future<Integer> tasler = service.submit(counter);

                    results.add(tasler);
//                    Thread t = new Thread(task);
//                    t.start();
                } else {
                    if (search(file)) {
                        if(file.isFile()) {
                            System.out.println(file);
                        }
                        count++;
                    } else {
                        count = 0;
                    }
                }
                for (Future<Integer> res : results) {
                    try {
                        count += res.get();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }

            }
            service.shutdown();
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        return count;
    }
}
