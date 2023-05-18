package Calculation;

public class Main {
    public static void main(String[] args) {
        Calculation addition = new Addition();
        Calculation division = new Division();

        System.out.println("Addition result: " + addition.calculate(412,1414));
        System.out.println("Division result: " + division.calculate(1431,11));
        System.out.println("Division result: " + division.calculate(41,0));
    }
}
