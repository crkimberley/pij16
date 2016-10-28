import java.io.*;

/**
 * @author crkimberley on 28/10/2016.
 */
public class Cat {
    public static void main(String[] args) {
        new Cat().launch(args[0]);
    }

    private void launch(String filename) {
        try (BufferedReader in = new BufferedReader(new FileReader(new File(filename)))) {

        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }

    }
}
