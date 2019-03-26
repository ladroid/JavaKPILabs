import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.*;

public class UserInput {
    /*
     * using Thread
     */
    public void start() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter directory (for example, /usr/local/jdk/lib/): ");
        String directory = in.nextLine();
        System.out.print("Enter keyword (for example, volatile): ");
        String keyword = in.nextLine();
        MatchCounter counter = new MatchCounter(new File(directory), keyword);
        FutureTask task = new FutureTask(counter);
        Thread t = new Thread(task);
        t.start();
        try {
            System.out.println(task.get() + " files found.");
        }
        catch(ExecutionException e) {
            e.printStackTrace();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*
     * using ExecutorService
     */
    public void startOther() {

        ExecutorService service = Executors.newSingleThreadExecutor();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter directory (for example, /usr/local/jdk/lib/): ");
        String directory = in.nextLine();
        System.out.print("Enter keyword (for example, volatile): ");
        String keyword = in.nextLine();
        MatchCounter counter = new MatchCounter(new File(directory), keyword);

        Future<Integer> task = service.submit(counter);

        try {
            System.out.println(task.get() + " files found.");
            service.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
            startOther();
        } catch (ExecutionException e) {
            e.printStackTrace();
            startOther();
        } catch (InputMismatchException ex) {
            System.out.println(ex);
            startOther();
        }
    }
}
