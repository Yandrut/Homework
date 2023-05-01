package FileReader;

public class TextFile implements FileReader {
    @Override
    public String read(String fileName) {
        return "Internals of the file";
    }
}
