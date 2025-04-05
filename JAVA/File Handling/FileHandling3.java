import java.io.*;

public class MergeFiles {
    public static void main(String[] args) {
        String file1 = "file1.txt";
        String file2 = "file2.txt";
        String mergedFile = "merged.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFile, true))) {
            writeFileContents(file1, writer);
            writeFileContents(file2, writer);
            System.out.println("Files merged successfully into " + mergedFile);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    private static void writeFileContents(String fileName, BufferedWriter writer) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
