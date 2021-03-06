package Task1_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class StringWorkModel implements Serializable {
    private String str;
    private String toRemove;

    public StringWorkModel() { }

    public StringWorkModel(String str, String toRemove) {
        this.str = str;
        this.toRemove = toRemove;
    }

    public void input() {
        System.out.println("Enter stroke: ");
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        System.out.println("Enter sign which to remove: ");
        toRemove = in.nextLine();
    }

    private String removeChar() {
        String[] arr = str.split(toRemove);
        String ans = "";
        for(String t : arr) {
            ans += t;
        }
        return ans;
    }

    public String gettingStrBefore() {
        String stroke = str;
        return stroke;
    }

    public String gettingStr() {
        String str = removeChar();
        return str;
    }

    public void writeToFile() {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("task12.txt", true))) {
            bufferedWriter.write(gettingStrBefore());
            bufferedWriter.newLine();
            bufferedWriter.write(gettingStr());
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
    @Override
    public String toString() {
        return gettingStr();
    }
}
