package Converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println();
            System.out.println("--- Choose action ---");
            System.out.println("1: Convert fahrenheit to celsius");
            System.out.println("2: Convert celsius to fahrenheit");
            System.out.println("3: Convert Dollars to Hryvnias");
            System.out.println("0: Exit program");
            System.out.println();
            System.out.println("Enter action: ");
            String input = in.nextLine();

            TemperatureConverter temperatureConverter = new TemperatureConverter();
            Converter currencyConverter = new CurrencyConverter();
            switch (input) {

                case "0":
                    in.close();
                    return;
                case "1":
                    System.out.print("Enter number to convert : ");
                    int toConvert = in.nextInt();
                    System.out.println(toConvert + " Fahrenheit In Celsius is: " + temperatureConverter.convert(toConvert));
                    break;
                case "2":
                    System.out.print("Enter number to convert : ");
                    toConvert = in.nextInt();
                    System.out.println(toConvert + " Celsius In Fahrenheit is: " + temperatureConverter.celsiusToFahrenheit(toConvert));
                    break;
                case "3":
                    System.out.print("Enter amount of Dollars you have: ");
                    toConvert = in.nextInt();
                    System.out.println(toConvert + " In Hryvnias is: " + currencyConverter.convert(toConvert));
                    break;
            }
        }
    }
}

