package Converter;

public class FahrenheitToCelsius implements Converter {
    @Override
    public int convert(int numberToConvert) {
        int temp = numberToConvert - 32;
        int result = temp * 5;
        return result/9;
    }
}
