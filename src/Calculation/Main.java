package Calculation;

public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition();
        Division division = new Division();
        Division division1 = new Division();

        System.out.println("Addition result: " + addition.calculate(412,1414));

        try {
            System.out.println("Division result: " + division1.calculate(1431,11));
            System.out.println("Division result: " + division.calculate(41,0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}
