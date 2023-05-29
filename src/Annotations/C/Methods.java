package Annotations.C;

public class Methods {
    @Test
    public static int testParameter () {
        System.out.println("testParameter is working");
        return 1;
    }
    public static int[] testInt(int ... ints) {
        return ints;
    }

    @Test
    public static void test() {
        System.out.println("Test is working");
    }
    @Test
    public boolean equals(Object obj) {
        return this.getClass() == obj.getClass();
    }
}
