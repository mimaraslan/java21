package _004_pattern_matching_instanceof;

class Product {
    String model;
    Double price;

    @Override
    public boolean equals(Object obj) {
        // OLD CODE
        /*
        if (obj instanceof Product ) {
           Product otherObj = (Product) obj;
           return model.equals(otherObj.model) && price.equals(otherObj.price);
        }
        return false;
        */

        // JAVA 14 - NEW CODE, LONG VERSION
        if (obj instanceof Product otherObj) {
            return model.equals(otherObj.model) && price.equals(otherObj.price);
        }
        return false;

        // JAVA 14 - NEW CODE, SHORT VERSION
        // return obj instanceof Monitor otherObj && model.equals(otherObj.model) && price.equals(otherObj.price);
    }
}

public class MainApplication {
    public static void main(String[] args) {
        // Product product1 = new Product();
        var product1 = new Product();
        product1.model = "Samsung";
        product1.price = 100.0;
        System.out.println("Product1: " + product1);
        System.out.println("Model: " + product1.model);
        System.out.println("Price: " + product1.price);

        System.out.println("--------------------------------------");

        //  Product product2 = new Product();
        var product2 = new Product();
        product2.model = "Asus";
        product2.price = 200.0;
        System.out.println("Product2: " + product2);
        System.out.println("Model: " + product2.model);
        System.out.println("Price: " + product2.price);

        System.out.println(product1.equals(product2));
    }
}
