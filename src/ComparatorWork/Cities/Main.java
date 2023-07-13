package ComparatorWork.Cities;

import java.util.*;

public class Main {

    public static <E> void iterate(Set<E> set) {
        for (E element : set) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Set<City> cities = new TreeSet<>();
        cities.add(new City("Lviv",149, 721000));
        cities.add(new City("Kryvyi Rih",430, 634000));
        cities.add(new City("Kyiv",839, 2884000));
        cities.add(new City("Dnipro",409.7, 966000));
        cities.add(new City("Poltava",103, 285000));
        cities.add(new City("Zaporizhia",334, 747000));

        System.out.println("Default comparable by Name");
        iterate(cities);

        Set <City> citesSortedByArea = new TreeSet<>(new City.AreaComparator());
        citesSortedByArea.addAll(cities);
        System.out.println("\n Cities sorted by Area:");
        iterate(citesSortedByArea);

        Set <City> citiesSortedByPopulation = new TreeSet<>(new City.PopulationComparator());
        citiesSortedByPopulation.addAll(cities);
        System.out.println("\n Cities sorted by Population:");
        iterate(citiesSortedByPopulation);

    }
}
