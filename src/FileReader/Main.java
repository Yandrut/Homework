package FileReader;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        TextFile textFile = new TextFile();
        try {
            System.out.println(textFile.read("Input.txt"));
            throw new FileNotFoundException("File was not found");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
