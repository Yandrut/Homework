package ComparatorWork.Products;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable <Product> {

    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return this.getPrice() == product.getPrice() && this.getName().equals(product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public int compareTo(Product product) {
        return this.getName().compareTo(product.getName());
    }

    static class PriceComparator implements Comparator<Product> {

        @Override
        public int compare(Product product, Product anotherProduct) {
            return Double.compare(product.getPrice(),anotherProduct.getPrice());
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
