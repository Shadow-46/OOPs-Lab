import java.io.*;
import java.util.*; 
import java.text.*; 
public class BuiltInPackage2 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a test file!");
            writer.close();
            FileReader reader = new FileReader("example.txt");
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while handling the file.");
            e.printStackTrace();
        }
        Date currentDate = new Date();
        System.out.println("\nCurrent date: " + currentDate);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedDate = formatter.format(currentDate);
        System.out.println("Formatted date: " + formattedDate);
    }
}
