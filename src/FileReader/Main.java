package FileReader;

public class Main {
    public static void main(String[] args) {
        TextFile textFile = new TextFile();
        textFile.writeToFile("input.txt", "Eritis sicus Deus, scientes bonum et malum");
        System.out.println(textFile.read("input.txt"));

    }
}
