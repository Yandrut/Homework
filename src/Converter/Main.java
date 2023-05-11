package Converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            int toConvert;
            Converter converter;

            System.out.println();
            System.out.println("--- Choose action ---");
            System.out.println("1: Convert fahrenheit to celsius");
            System.out.println("2: Convert celsius to fahrenheit");
            System.out.println("3: Convert Dollars to Hryvnias");
            System.out.println("0: Exit program");
            System.out.println();
            System.out.println("Enter action: ");
            String input = in.nextLine();



            switch (input) {
                case "0":
                    in.close();
                    return;
                case "1":
                   try {
                       System.out.print("Enter number to convert : ");
                       toConvert = in.nextInt();
                       converter = ConverterFactory.getConverter('f');
                       System.out.println(toConvert + " Fahrenheit In Celsius is: " + converter.convert(toConvert));
                   } catch (IllegalArgumentException e) {
                       System.out.println(e.getMessage());
                   }
                   break;
                case "2":
                    try {
                        System.out.print("Enter number to convert : ");
                        toConvert = in.nextInt();
                        converter = ConverterFactory.getConverter('c');
                        System.out.println(toConvert + " Celsius In Fahrenheit is: " + converter.convert(toConvert));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "3":
                    try {
                        System.out.print("Enter amount of Dollars you have: ");
                        toConvert = in.nextInt();
                        converter = ConverterFactory.getConverter("currency");
                        System.out.println(toConvert + " In Hryvnias is: " + converter.convert(toConvert));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }
    }
}

