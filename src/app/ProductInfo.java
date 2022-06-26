package app;

import app.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductInfo {

    public static void main(String[] args) {
        showTitle();
        purchase01();
    }

    private static Product getProductOne() {
        Product product = new Product();
        product.name = "Orange";
        product.quantity = 15;

        return product;
    }

    private static Product getProductTwo() {
        Product product02 = new Product();
        product02.name = "Pear";
        product02.quantity = 10;

        return product02;
    }

    private static void purchase01() {
        List<Product> purchase = new ArrayList<>();
        purchase.add(getProductOne());
        purchase.add(getProductTwo());

        System.out.println(purchase);
    }

    private static void showTitle() {
        System.out.println("---Purchase Info---");
    }
}
