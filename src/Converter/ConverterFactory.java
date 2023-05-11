package Converter;

public class ConverterFactory {

   public static Converter getConverter (char option) {
       if (option == 'c' || option == 'C') {
           return new CelsiusToFahrenheit();
       } else if (option == 'f' || option == 'F')
           return new FahrenheitToCelsius();
       else {
           return null;
       }
   }
        public static Converter getConverter (String option) {
            return new CurrencyConverter();
   }
}
