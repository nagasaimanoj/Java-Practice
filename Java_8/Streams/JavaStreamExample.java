import java.util.List;
import java.util.ArrayList;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return "id : " + this.id + "; name : " + this.name + "; price : " + this.price;
    }
}

public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> laptopsList = new ArrayList<Product>();
        laptopsList.add(new Product(1, "HP Laptop", 25000f));
        laptopsList.add(new Product(2, "Dell Laptop", 30000f));
        laptopsList.add(new Product(3, "Lenevo Laptop", 28000f));
        laptopsList.add(new Product(4, "Sony Laptop", 28000f));
        laptopsList.add(new Product(5, "Apple Laptop", 90000f));

        laptopsList.stream()
            .filter(p -> p.price > 25000)
            .forEach(System.out::println);
    }
}
