import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Application app = new Application();
        System.out.println(app.getInfo1());
        app.columnList(app.sortList(app.getInfo1()));
        System.out.println(app.getInfo2());
        app.columnList(app.sortList(app.getInfo2()));


    }
}
