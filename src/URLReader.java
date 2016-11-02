import java.net.*;
import java.io.*;

/**
 * Created by chris on 02/11/2016.
 */

public class URLReader {
    public static void main(String[] args) throws Exception {
        URL oracle = new URL("https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}