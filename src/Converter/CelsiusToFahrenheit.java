package Converter;

public class CelsiusToFahrenheit implements Converter {
    @Override
    public int convert(int numberToConvert) {
            return (int) (numberToConvert * 1.8f) + 32;
        }
    }
