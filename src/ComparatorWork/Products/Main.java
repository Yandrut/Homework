package ComparatorWork.Products;

import java.util.*;

public class Main {

    public static <T> void iterate(Set <T> set) {
        for (T element : set) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        Product mayonnaise = new Product("Provansal",19);
        Product soda = new Product("Coke", 28);
        Product bread = new Product("Bread", 22);
        Product potato = new Product("Potato", 5);
        Product banana = new Product("Banana", 39);
        Product coffee = new Product("Java", 1000);

        Map <Product, Integer> productMap = new HashMap<>();
        productMap.put(mayonnaise,1);
        productMap.put(soda,2);
        productMap.put(bread,3);
        productMap.put(potato,4);
        productMap.put(coffee,5);
        productMap.put(banana,6);

        Set <Product> productNames = new TreeSet<>(productMap.keySet());
        System.out.println("Map sorted by product name:");
        iterate(productNames);

        Set<Product> productPrices = new TreeSet<>(new Product.PriceComparator());
        productPrices.addAll(productNames);
        System.out.println("\n Map sorted by product price:");
        iterate(productPrices);

    }
}
