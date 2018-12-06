package Task1_3;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadInfoChoice {

    public void readChoice(ReadInformation readInformation) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.println("Choice for read\n1)ReadFromFile\n2)ReadInRange\n3)ReadDiagnose");
        String choiceRead = in.nextLine();

        Scanner input = new Scanner(System.in);
        try {
            switch (ReadMenuEnum.valueOf(choiceRead.trim())) {
                case ReadFromFile:
                    readInformation.readFromFile();
                    break;
                case ReadInRange:
                    System.out.println("Enter range from to");
                    int a = input.nextInt();
                    int b = input.nextInt();
                    readInformation.readInRange(a, b);
                    break;
                case ReadDiagnose:
                    System.out.println("Enter diagnose");
                    String diagnose = input.nextLine();
                    readInformation.ParseFile("test.txt", diagnose);
                    break;
                default:
                    throw new IllegalArgument("Error", 1);
            }
        } catch(IllegalArgumentException iae) {
            throw new IllegalArgument("Error", 1);
        }
    }
}
