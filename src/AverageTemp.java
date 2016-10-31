import java.io.*;

/**
 * @author crkimberley on 28/10/2016.
 */
public class AverageTemp {
    public static void main(String[] args) {
        new AverageTemp().launch(args[0]);
    }

    private void launch(String filename) {
        try (BufferedReader in = new BufferedReader(new FileReader(new File(filename)))) {
            int numberOfNumbersInFile = 0;
            int fileSum = 0;
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
                int numberOfNumbersOnLine = 0;
                int lineSume = 0;
                for (String number: line.split(", ")) {
                    numberOfNumbersOnLine++;
                    lineSume += Integer.parseInt(number);
                }
                System.out.println("Average of numbers on line = "
                        + (lineSume / numberOfNumbersOnLine));
                numberOfNumbersInFile += numberOfNumbersOnLine;
                fileSum += lineSume;
            }
            System.out.println("Average of all numbers in whole file = "
                    + (fileSum / numberOfNumbersInFile));
        } catch (FileNotFoundException ex) {
            System.out.println("File " + filename + " does not exist");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}