public class View {
    private ReadInfo readInfo;

    public View(ReadInfo readInfo) {
        this.readInfo = readInfo;
    }

    public void read(ReadInfo readInfo) {
        readInfo.readAll();
    }
}
