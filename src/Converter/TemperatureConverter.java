package Converter;

public class TemperatureConverter implements Converter {

    //fahrenheit to celsius
    @Override
    public int convert(int numberToConvert) {
        int temp = numberToConvert - 32;
        int result = temp * 5;
        return result/9;
    }
    public int celsiusToFahrenheit(int toConvert) {
        return (int) (toConvert * 1.8f + 32);
    }
}
