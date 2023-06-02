package Enum.C;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        float one = scanner.nextFloat();
        System.out.println("Enter second number: ");
        float two = scanner.nextFloat();

        System.out.println(Operation.DIVISION.execute(one,two));

    }

}