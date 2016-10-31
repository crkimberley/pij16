import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by chris on 31/10/2016.
 */
public class Sort {
    public static void main(String[] args) {
        new Sort().launch(args[0]);
    }

    private void launch(String filename) {
        try (BufferedReader in = new BufferedReader(new FileReader(new File(filename)))) {
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = in.readLine()) != null) {
                lines.add(line);
            }
            Collections.sort(lines);
            // Java 8 forEach statement with method reference
            lines.forEach(System.out::println);
        } catch (FileNotFoundException ex) {
            System.out.println("File " + filename + " does not exist");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}