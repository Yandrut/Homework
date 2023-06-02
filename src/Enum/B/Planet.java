package Enum.B;
@SuppressWarnings("unused")
public enum Planet {
    MERCURY(3.3011 * Math.pow(10,24),2.439),
    VENUS(4.8675 * Math.pow(10,24),6.051),
    EARTH(5.972 * Math.pow(10,24),6.371),
    MARS(6.4171 * Math.pow(10,23),33.89),
    JUPITER(18.982 * Math.pow(10,27),69.911),
    SATURN(5.6834 * Math.pow(10,26),58.232),
    NEPTUNE(10.243 * Math.pow(10,26),24.622),
    PLUTO(1.303 * Math.pow(10,22),1.118);

    private final double weight;
    private final double radius;
    private static final double G = 6.67430 * Math.pow(10, -11);

    Planet(double weight, double radius) {
        this.weight = weight;
        this.radius = radius;
    }
    public double getWeight() {
        return weight;
    }
    public double getRadius() {
        return radius;
    }
    public double getGravitationalForce(int objectWeightInKilograms) {
        return (G * this.getWeight() * objectWeightInKilograms) / (Math.pow(this.getRadius(), 2));
    }
}
