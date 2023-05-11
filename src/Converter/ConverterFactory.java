package Converter;

public class ConverterFactory {

   public static Converter getConverter (String option) {
       if (option.equals("c") || option.equals("C")) {
           return new CelsiusToFahrenheit();
       } else if (option.equals("f") || option.equals("F")) {
           return new FahrenheitToCelsius();
       } else if (option.equals("currency")) {
           return new CurrencyConverter();
       } else {
          throw new IllegalArgumentException("Converter was not found!");
       }
   }
    }
