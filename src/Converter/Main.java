package Converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Converter converter;
            Scanner in = new Scanner(System.in);
            System.out.println();
            System.out.println("--- Choose action ---");
            System.out.println("f : Convert fahrenheit to celsius");
            System.out.println("c : Convert celsius to fahrenheit");
            System.out.println("currency : Convert Dollars to Hryvnias");
            System.out.println("0 : exit program");
            System.out.println();
            System.out.println("Enter action: ");
            String input = in.nextLine();

            if (input.equals("0")) {
                in.close();
                return;
            }
                try {
                converter = ConverterFactory.getConverter(input);
                System.out.println("Enter number to convert: ");
                int toConvert = in.nextInt();
                System.out.println("Result: " + converter.convert(toConvert));
            } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

