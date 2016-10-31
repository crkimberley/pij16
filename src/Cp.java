import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by chris on 28/10/2016.
 */
/*public class Cp {
    public static void main(String[] args) {
        new Cp().launch(args);
    }

    private void launch(String[] filenames) {
        List<File> files = new ArrayList<>();
        for (String filename : filenames) {
            File file = new File(filename);
            if (file.exists()) {
                files.add(file);
            } else {
                System.out.println(filename + " doesn't exist");
            }
        }
        File directory = new File(files.get(files.size() - 1);
        if (!directory.isDirectory()) {
            System.out.println(directory.getName() + " isn't a directory");
            return;
        }
        System.out.print("Overwrite directory " + directory.getName() + " ? (y/n): ");
        Scanner input = new Scanner(System.in);
        if (!input.next().equals("y")) {
            System.out.println(directory.getName() + " won't be overwritten");
            return;
        }
        for ()
        try (BufferedReader in = new BufferedReader(new FileReader(files[]));
             PrintWriter out = new PrintWriter(files.get(files.size() - 1))) {
            String line;
            while ((line = in.readLine()) != null) {
                out.println(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(filenames[0] + " not found");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
*/