package FileReader;
import java.io.*;

public class TextFile implements FileReader {
    @Override
    public String read(String fileName) {
        String content = "";
        BufferedReader reader;
        try {
            reader = new BufferedReader(new java.io.FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                content += line + "\n";
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return content;
    }
    public void writeToFile (String fileName, String content) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write("\n" + content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
