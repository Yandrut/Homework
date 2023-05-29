package Annotations.C;
@SuppressWarnings("unused")
public class TestClass {
    public TestClass(String initArgs) {}
    @Test
    public void firstTest () {
        System.out.println("firstTest is working");
    }
    @Test
    public int[] testInt(int ... ints) {
        return ints;
    }
    @Test
    public void nothing (int [] nums) {
        System.out.println("Takes integer array");
    }
    public void testWithNoAnnotation () {
        System.out.println(this.toString());
    }
    @Test
    public void divideByZero () {
        int result = 1488/0;
        System.out.println(result);
    }
    @Test
    public void mySecondTest() {
        System.out.println("mySecondTest is working");
    }

}
