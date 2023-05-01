package Converter;

public class CurrencyConverter implements Converter {

    @Override
    public int convert(int numberToConvert) {
        return (int) (numberToConvert * 37.5);
    }
}
