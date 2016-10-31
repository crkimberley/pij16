import java.io.File;

/**
 * Created by chris on 29/10/2016.
 */
public class CpMultiple {
    public static void main(String[] args) {
        new CpMultiple().launch(args);
    }

    private void launch(String[] filenames) {
        File directory = new File(filenames[filenames.length - 1]);
        if (!directory.isDirectory()) {
            System.out.println("Final filename supplied was not a directory");
            return;
        }

    }
}
