import java.io.File;

/**
 * @author crkimberley on 28/10/2016.
 */
public class MkDir {
    public static void main(String[] args) {
        new File(args[0]).mkdir();
    }
}