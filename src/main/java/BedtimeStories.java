import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BedtimeStories {
    public static void main(String[] args) {
        BufferedReader reader;

        try {

            System.out.println("Choose a file to read (goldilocks.txt, hansel_and_gretel.txt, mary_had_a_little_lamb.txt): ");
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = inputReader.readLine();


            reader = new BufferedReader(new FileReader("Mod01/" + fileName));
            String line;
            int lineNumber = 1;


            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }


            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
