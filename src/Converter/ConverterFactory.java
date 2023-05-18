package Converter;

public class ConverterFactory {

   public static Converter getConverter (String option) {
       if (option.equalsIgnoreCase("c")) {
           return new CelsiusToFahrenheit();
       } else if (option.equalsIgnoreCase("f")) {
           return new FahrenheitToCelsius();
       } else if (option.equalsIgnoreCase("currency")) {
           return new CurrencyConverter();
       } else {
          throw new IllegalArgumentException("Converter was not found!");
       }
   }
    }
