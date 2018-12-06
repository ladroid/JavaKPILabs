package Task1_3.read;

import Task1_2.StringWorkModel;
import Task1_3.Task1_3;

import java.io.*;
import java.util.Scanner;

public class ReadInformation implements Serializable {
    public String readFromFile() {
        String str;
        StringBuilder sb = new StringBuilder();
        System.out.printf("%1s %10s %10s %11s %11s %12s %12s %12s\n", "ID", "firstName", "lastName",
                "Patronym", "Address", "Phone", "Med Card", "Diagnose");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
            while ((str = bufferedReader.readLine()) != null) {
                //System.out.println(String.format(str));
                sb.append(str + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public String readInRange(Integer low, Integer high) {
        String[] splitdata;
        String sixcol; Integer num=0;
        StringBuilder sb = new StringBuilder();
        String str;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
            while ((str = bufferedReader.readLine()) != null) {
                splitdata = str.split("[,\t]");
                sixcol = splitdata[0];
                Integer aa = num.valueOf(sixcol);
                if(aa > low && aa < high) {
                    //System.out.println(str);
                    sb.append(str + "\n");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public void parseFile(String fileName, String searchStr) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        StringBuilder sb = new StringBuilder();
        while (scan.hasNext()) {
            String line = scan.nextLine();
            if(line.contains(searchStr)) {
                System.out.println(line);
                //sb.append(line + "\n");
            }
        }
        //return sb.toString();
    }

    public Object readObjectFromFile(String filepath) {
        try {
            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Object obj = objectIn.readObject();
            System.out.println("The Object has been read from the file");
            objectIn.close();
            return obj;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
