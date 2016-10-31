import java.io.*;
import java.util.Scanner;

/**
 * Created by chris on 28/10/2016.
 */
public class CpBinary {
    public static void main(String[] args) {
        new CpBinary().launch(args[0], args[1]);
    }

    private void launch(String source, String destination) {
        File sourceFile = new File(source);
        File destinationFile = new File(destination);
        if (destinationFile.exists()) {
            System.out.print("Overwrite " + destinationFile + " ? (y/n): ");
            Scanner input = new Scanner(System.in);
            if (!input.next().equals("y")) {
                System.out.println("OK - " + destinationFile + " won't be overwritten");
                return;
            }
        }
        try (InputStream in = new FileInputStream(sourceFile);
             OutputStream out = new FileOutputStream(destinationFile)) {
            int fileSize = in.available();
            System.out.println("File size = " + fileSize + " bytes");
            byte[] dataArray = new byte[fileSize];
            int data;
            while ((data = in.read(dataArray)) != -1) {
                out.write(dataArray);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File " + sourceFile + " not found");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}