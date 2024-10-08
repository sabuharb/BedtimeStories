import javax.swing.text.StringContent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BedtimeStories {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which story would you like to read? (goldilocks.txt, hansel_and_gretel.txt, mary_had_a_little_lamb.txt: ");
        String fileName = input.nextLine();
        
        
        File file = new File("Mod01/" + fileName);
        
        
        try {
            Scanner fileReader = new Scanner(file);
            int lineNumber = 1;
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the file name and try again.");
        }

    }

}
