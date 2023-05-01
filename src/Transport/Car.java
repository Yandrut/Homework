package Transport;

public class Car implements Transport {

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}
