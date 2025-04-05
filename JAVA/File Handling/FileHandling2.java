import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File oldFile = new File("merged.txt");
        File newFile = new File("newname.txt");

        if (oldFile.exists()) {
            if (oldFile.renameTo(newFile)) {
                System.out.println("File renamed successfully.");
            } else {
                System.out.println("Failed to rename the file.");
            }
        } else {
            System.out.println("Old file does not exist.");
        }
    }
}
