package Converter;

public class ConverterFactory {

   public static Converter getConverter (char option) {
       if (option == 'c' || option == 'C') {
           return new CelsiusToFahrenheit();
       } else if (option == 'f' || option == 'F')
           return new FahrenheitToCelsius();
       else {
          throw new IllegalArgumentException("Converter was not found");
       }
   }
        public static Converter getConverter (String option) {
            if (option.equals("currency")) {
                return new CurrencyConverter();
            }
            throw new IllegalArgumentException("Converter was not found");
        }
    }
