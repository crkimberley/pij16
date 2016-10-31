import java.io.*;
import java.util.*;

/**
 * Created by chris on 31/10/2016.
 */
public class Uniq {
    public static void main(String[] args) {
        new Uniq().launch(args[0]);
    }

    private void launch(String filename) {
        try (BufferedReader in = new BufferedReader(new FileReader(new File(filename)))) {
            Set<String> lines = new LinkedHashSet<>();
            String line;
            while ((line = in.readLine()) != null) {
                lines.add(line);
            }
            lines.forEach(System.out::println);
        } catch (FileNotFoundException ex) {
            System.out.println("File " + filename + " does not exist");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}