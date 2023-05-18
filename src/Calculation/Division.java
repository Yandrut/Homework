package Calculation;

public class Division implements Calculation {
    @Override
    public int calculate(int one, int two) {
        int result = 0;
        try {
            result = one/two;
        } catch (ArithmeticException e) {
            System.out.println("This operation is not supported");
        }
        return result;
    }
}
