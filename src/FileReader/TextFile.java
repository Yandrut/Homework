package FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content;
    }
}
