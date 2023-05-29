package Annotations.C;
@SuppressWarnings("unused")
public class TestClass {
    public TestClass(String initArgs) {}
    @Test
    public void secondTest () {
        System.out.println("testParameter is working");
    }
    public int[] testInt(int ... ints) {
        return ints;
    }
    @Test
    public void myFirstTest() {
        System.out.println("Test is working");
    }
    @Test
    public boolean equals(Object obj) {
        return this.getClass() == obj.getClass();
    }
}
