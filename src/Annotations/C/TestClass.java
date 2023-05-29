package Annotations.C;
@SuppressWarnings("unused")
public class TestClass {
    public TestClass(String initArgs) {}
    @Test
    public void secondTest () {
        System.out.println("testParameter is working");
    }
    @Test
    public int[] testInt(int ... ints) {
        return ints;
    }
    @Test
    public void myFirstTest() {
        System.out.println("Test is working");
    }
    @Test
    public void nothing (int [] nums) {
        System.out.println("Takes integer array");
    }
    public void testWithNoAnnotation () {
        System.out.println(this.toString());
    }
}
