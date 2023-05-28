package Annotations.C;

public class Methods {
    public static int testParameter (int n) {
        return 1;
    }
    public static int[] testInt(int ... ints) {
        return ints;
    }

    @Test
    public static void test() {
        System.out.println("Wello Horld");
    }
    public static void test (Main main) {
        System.out.println(main.equals(new Object()));
    }
}
