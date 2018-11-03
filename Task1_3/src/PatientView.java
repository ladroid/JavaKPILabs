import java.io.*;
import java.util.Scanner;

public class PatientView {
    //private PatientModel pm;
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

    public void readInRange(PatientModel pm, Integer a, Integer b) {
        System.out.println("OLA " + pm.getMedicalCard());
        try {
            String str;
            BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
            for(int i = a; i < b; i++) {
                while ((str = bufferedReader.readLine()) != null) {
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


class Range
{
    private int low;
    private int high;

    public Range(int low, int high){
        this.low = low;
        this.high = high;
    }

    public boolean contains(int number){
        return (number >= low && number <= high);
    }
}