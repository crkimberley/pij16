import java.io.*;
import java.util.Scanner;

/**
 * Created by chris on 28/10/2016.
 */
public class Cp {
    public static void main(String[] args) {
        new Cp().launch(args);
    }

    private void launch(String[] filenames) {
        File sourceFile = new File(filenames[0]);
        if (!sourceFile.exists()) {
            System.out.println(filenames[0] + " does not exist");
        } else {
            File destinationFile = new File(filenames[1]);
            if (destinationFile.exists()) {
                System.out.print("Overwrite " + destinationFile + " ? (y/n): ");
                Scanner input = new Scanner(System.in);
                if (!input.next().equals("y")) {
                    System.out.println("OK - " + destinationFile + " won't be overwritten");
                    return;
                }
            }
            try (BufferedReader in = new BufferedReader(new FileReader(sourceFile));
                 PrintWriter out = new PrintWriter(destinationFile)) {
                String line;
                while ((line = in.readLine()) != null) {
                    out.println(line);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
