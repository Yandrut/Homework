package Converter;

public class TemperatureConverterFactory {
   private TemperatureConverterFactory () {}

   public static Converter getConverter (char option) {
       if (option == 'c' ||  option == 'C') {
            return new CelsiusToFahrenheit();
        }
        else if (option == 'f' || option == 'F')
            return new FahrenheitToCelsius();
        else {
            return null;
       }
   }

}
