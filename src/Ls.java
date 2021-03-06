import java.io.File;
import java.util.Arrays;

/**
 * @author crkimberley on 28/10/2016.
 */
public class Ls {
    public static void main(String[] args) {
        new Ls().launch();
    }

    private void launch() {
        System.out.println("CURRENT DIRECTORY");
        System.out.println(Arrays.toString(new File(".").list()));
        System.out.println("HOME DIRECTORY");
        System.out.println(Arrays.toString(new File(System.getProperty("user.home")).list()));
        System.out.println("RELATIVE PATHNAMES - eg. go up 2 levels - then listFiles()to give pathnames");
        System.out.println(Arrays.toString(new File("../../").listFiles()));
    }
}
