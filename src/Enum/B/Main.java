package Enum.B;

import java.util.Scanner;

public class Main {

        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter weight of an object in kg: ");
            int weight = scanner.nextInt();

            for (Planet planet : Planet.values()) {
                System.out.println("Planet " + planet + "'s" +  " Gravitational force to an object of weight: " + weight + " is: " + planet.getGravitationalForce(weight) + "H");
            }
        }
    }

