package Converter;

public class TemperatureConverter implements Converter {

    //fahrenheit to celsius
    @Override
    public int convert(int numberToConvert) {
        float temp = numberToConvert - 32;
        float result = temp * 5;
        return (int) result/9;
    }
    public int celsiusToFahrenheit(int toConvert) {
        return (int) (toConvert * 1.8f + 32);
    }
}
