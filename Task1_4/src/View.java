import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class View {
    public void readAll() {
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
}
