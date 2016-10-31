import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by chris on 31/10/2016.
 */
public class CpMultipleFiles {
    public static void main(String[] args) {
        new CpMultipleFiles().launch(args);
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
        File directory = files.get(files.size() - 1);
        if (!directory.isDirectory()) {
            System.out.println(directory + " isn't a directory");
            return;
        }
        System.out.print("Overwrite directory " + directory + " ? (y/n): ");
        Scanner input = new Scanner(System.in);
        if (!input.next().equals("y")) {
            System.out.println(directory + " won't be overwritten");
            return;
        }
        for (int i=0; i<files.size()-1; i++) {
            String pathname = directory + "/" + files.get(i);
            copy(files.get(i), new File(pathname));
        }
    }

    private void copy(File fileToCopy, File fileToCopyInto) {
        try (BufferedReader in = new BufferedReader(new FileReader(fileToCopy));
             PrintWriter out = new PrintWriter(fileToCopyInto)) {
            String line;
            while ((line = in.readLine()) != null) {
                out.println(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(fileToCopy + " not found");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}