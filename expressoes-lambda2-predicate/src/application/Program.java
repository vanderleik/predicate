package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //Remover todos os ítens que tem preço igual ou maior a 100.0
//        list.removeIf(new ProductPredicate());//via interface
//        list.removeIf(Product::staticProductPredicate);//Method reference
//        list.removeIf(Product::nonStaticProductPredicate);//Method reference
        double min = 100.0;
//        Predicate<Product> pred = p -> p.getPrice() >= min;
//
//        list.removeIf(pred);//Expressão lambda declarada

        list.removeIf(p -> p.getPrice() >= min);//Expressão lambda inline

        for (Product p: list) {
            System.out.println(p);
        }
    }
}
