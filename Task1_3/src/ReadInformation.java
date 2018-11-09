import java.io.*;
import java.util.Scanner;

public class ReadInformation {
    public void readFromFile() {
        System.out.printf("%1s %10s %10s %11s %11s %12s %12s %12s\n", "ID", "firstName", "lastName",
                "Patronym", "Address", "Phone", "Med Card", "Diagnose");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        try {
            String str;
            BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(String.format(str));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readInRange(PatientModel pm, Integer low, Integer high) {
        String[] splitdata;
        String sixcol; Integer num=0;
        try {
            String str;
            BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
            while ((str = bufferedReader.readLine()) != null) {
                splitdata = str.split("[,\t]");
                sixcol = splitdata[0];
                Integer aa = num.valueOf(sixcol);
                if(aa > low && aa < high) {
                    System.out.println(str);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ParseFile(String fileName, String searchStr) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        while (scan.hasNext()) {
            String line = scan.nextLine();
            if(line.contains(searchStr)) {
                System.out.println(line);
            }
        }
    }
}
