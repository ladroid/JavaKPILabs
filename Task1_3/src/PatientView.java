import java.io.*;
import java.util.Scanner;

public class PatientView {
    public void readFromFile() {
        System.out.printf("%1s %10s %10s %10s %10s %10s %10s %10s\n", "ID", "First Name", "Last Name",
                "Patronymic", "Address", "Number Phone", "Medical Card", "Diagnose");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        try {
            String str;
            BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readInRange(PatientModel pm, Integer a, Integer b) {
        System.out.println("OLA");
        if (pm.getMedicalCard() > a && pm.getMedicalCard() < b) {
            try {
                String str;
                BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
                while ((str = bufferedReader.readLine()) != null) {
                    System.out.println(str);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
