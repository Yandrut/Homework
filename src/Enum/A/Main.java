package Enum.A;

public class Main {

    public static void main(String[] args) {
            try {
                System.out.println(Days.dayOff("friday"));
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
    }
}
