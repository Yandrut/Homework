package Enum.B;
@SuppressWarnings("unused")
public enum Planet {
    Mercury(3.3011 * Math.pow(10,24),2.439),
    Venus(4.8675 * Math.pow(10,24),6.051),
    Earth(5.972 * Math.pow(10,24),6.371),
    Mars(6.4171 * Math.pow(10,23),33.89),
    Jupiter(18.982 * Math.pow(10,27),69.911),
    Saturn(5.6834 * Math.pow(10,26),58.232),
    Neptune(10.243 * Math.pow(10,26),24.622),
    Pluto(1.303 * Math.pow(10,22),1.118);

    private final double weight;
    private final double radius;

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
}
