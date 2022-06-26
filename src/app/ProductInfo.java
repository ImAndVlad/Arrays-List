package app;

import app.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductInfo {

    static int score;

    public static void main(String[] args) {
        showTitle();
        showList();
        purchase01(showList());
        showTitle02();
        showTitle();
        purchase02(showList());
        showTitle02();
        showTitle();
        purchase03(showList());
        showTitle02();
        showTitle();
        purchase04(showList());
        showTitle02();
        showTitle();
        purchase05(showList());
        showTitle02();
        showTitle();
        purchase06(showList());
        showTitle02();
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

    private static Product getProductThree() {
        Product product03 = new Product();
        product03.name = "Cherry";
        product03.quantity = 4;

        return product03;
    }

    private static List<Product> showList() {
        List<Product> purchase = new ArrayList<>();
        purchase.add(getProductOne());
        purchase.add(getProductTwo());

        return purchase;
    }

    private static void purchase01(List<Product> products) {
        System.out.println(products);
    }

    private static void purchase02(List<Product> products) {
        List<Product> purchase02 = new ArrayList<>(products);
        purchase02.add(0, getProductThree());

        System.out.println(purchase02);
    }

    private static void purchase03(List<Product> products) {
        List<Product> purchase03 = new ArrayList<>(products);
        purchase03.clear();

        System.out.println(purchase03);
    }

    private static void purchase04(List<Product> products) {
        List<Product> purchase04 = new ArrayList<>(products);
        purchase04.add(getProductThree());

        System.out.println(purchase04.get(1));
    }

    private static void purchase05(List<Product> products) {
        List<Product> purchase05 = new ArrayList<>(products);

        System.out.println(purchase05.isEmpty());
    }

    private static void purchase06(List<Product> products) {
        List<Product> purchase06 = new ArrayList<>(products);
        purchase06.remove(getProductTwo());
        purchase06.remove(0);

        System.out.println(purchase06);
    }

    private static void showTitle() {
        score++;
        System.out.println("--- Purchase Info " + score + " ---");
    }

    private static void showTitle02() {
        System.out.println("----------------------------------\n");
    }
}
