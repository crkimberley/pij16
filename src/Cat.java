import java.io.*;

/**
 * @author crkimberley on 28/10/2016.
 */
public class Cat {
    public static void main(String[] args) {
        new Cat().launch(args);
    }

    private void launch(String[] filenames) {
        for (String filename : filenames) {
            File file = new File(filename);
            try (BufferedReader in = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = in.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (FileNotFoundException ex) {
                System.out.println("File " + filename + " does not exist");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
