package CollectionFramework.Map;
import java.util.ArrayList;
import java.util.List;
//Comparable is used to define natural sorting method for a class
//while comparator is used to define a custom sorting logic
public class ComparableDemo {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Toy", 2.3));
        list.add(new Product("Ball", 13.23));
        list.add(new Product("Bat", 123.23));
        list.add(new Product("Racket", 78.43));

        list.sort(null);
        System.out.println(list);
    }
}


class Product implements Comparable<Product> {
    private String name;
    private double price;

      
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

   
    public void setPrice(double price) {
        this.price = price;
    }
   
    @Override
    public String toString() {
        return "name: " + name + "price: " + price;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;

        Product product = (Product) obj;
        return name == product.getName() && price == product.getPrice();
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(o.getPrice(), this.getPrice());//descending order
    }

 



} 