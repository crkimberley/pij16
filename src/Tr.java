import java.io.*;

/**
 * Created by chris on 31/10/2016.
 */
public class Tr {
    public static void main(String[] args) {
        if (args.length == 3) {
            new Tr().launch(args[0], args[1], args[2]);
        }
    }

    private void launch(String filename, String string1, String string2) {
        try (BufferedReader in = new BufferedReader(new FileReader(new File(filename)))) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line.replace(string1, string2));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File " + filename + " does not exist");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
