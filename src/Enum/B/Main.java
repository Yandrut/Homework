package Enum.B;

public class Main {
    public static double gravitationalForce(Planet planet, int objectWeight) {
        // Gravitational constant
        final double G = 6.67430 * Math.pow(10, -11);
        return (G * planet.getWeight() * objectWeight) / (Math.pow(planet.getRadius(), 2));
    }

        public static void main (String[] args) {
            System.out.println(gravitationalForce(Planet.Jupiter, 50));
        }
    }

