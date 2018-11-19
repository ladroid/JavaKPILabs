package Task1_2;

public class StringWorkView {

    public void view(StringWorkModel stringWorkModel) {
        System.out.println("Before");
        System.out.println(stringWorkModel.gettingStrBefore());
        System.out.println("After");
        System.out.println(stringWorkModel.gettingStr());
    }

    public void read(ReadFile readFile, StringWorkModel stringWorkModel) {
        readFile.viewFromFile(stringWorkModel);
    }
}
