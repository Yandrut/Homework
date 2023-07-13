package ComparatorWork.Cities;

import java.util.Comparator;
import java.util.Objects;

public class City implements Comparable<City> {
    private final String name;
    private final double area;
    private final int population;

    public City(String name, double area, int population) {
        this.name = name;
        this.area = area;
        this.population = population;
    }

    public String getName() { return name; }
    public double getArea() { return area; }
    public int getPopulation() { return population; }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", population=" + population +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        City city = (City) o;
        return this.getName().equals(city.getName()) &&
                this.getArea() == city.getArea() &&
                this.getPopulation() == city.getPopulation();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, area, population);
    }

    @Override
    public int compareTo(City city) {
        return this.getName().compareTo(city.getName());
    }

    static class AreaComparator implements Comparator<City> {

        @Override
        public int compare(City city, City anotherCity) {
            return Double.compare(city.getArea(), anotherCity.getArea());
        }
    }
    static class PopulationComparator implements Comparator<City> {

        @Override
        public int compare(City city, City anotherCity) {
            return Integer.compare(city.getPopulation(),anotherCity.getPopulation());
        }
    }
}
