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

        showTitle();
        purchase07(showList());
        showTitle02();

        showTitle();
        purchase08(showList());
        showTitle02();

        showTitle();
        purchase09(showList());
        showTitle02();

        showTitle();
        purchase10(showList());
        showTitle02();

        showTitle();
        purchase11(showList());
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
        // void add()
        List<Product> purchase = new ArrayList<>();
        purchase.add(getProductOne());
        purchase.add(getProductTwo());

        return purchase;
    }

    private static void purchase01(List<Product> products) {
        // boolean add()
        System.out.println(products.add(getProductThree()));
    }

    private static void purchase02(List<Product> products) {
        // void add()
        List<Product> purchase02 = new ArrayList<>(products);
        purchase02.add(0, getProductThree());

        System.out.println(purchase02);
    }

    private static void purchase03(List<Product> products) {
        // void clear()
        List<Product> purchase03 = new ArrayList<>(products);
        purchase03.clear();

        System.out.println(purchase03);
    }

    private static void purchase04(List<Product> products) {
        // int get()
        List<Product> purchase04 = new ArrayList<>(products);
        purchase04.add(getProductThree());

        System.out.println(purchase04.get(2));
    }

    private static void purchase05(List<Product> products) {
        // boolean isEmpty()
        System.out.println(products.isEmpty());
    }

    private static void purchase06(List<Product> products) {
        // boolean remove()
        System.out.println(products.remove(getProductOne()));
    }

    private static void purchase07(List<Product> products) {
        // remove()
        System.out.println(products.remove(0));
    }

    private static void purchase08(List<Product> products) {
        // set()
        List<Product> purchase07 = new ArrayList<>(products);
        purchase07.set(1, new Product());

        System.out.println(purchase07);
    }

    private static void purchase09(List<Product> products) {
        // int size()
        System.out.println(products.size());
     }

     private static void purchase10(List<Product> products) {
         // IntList subList()
        List<Product> purchase09 = new ArrayList<>(products);
        purchase09.add(getProductThree());

         System.out.println(purchase09.subList(1, 3));
     }

     private static void purchase11(List<Product> products) {
         // boolean addAll()
         Product products02 = new Product();
         products02.name = "Milk";
         products02.quantity = 33;

         List<Product> purchase11 = new ArrayList<>();
         purchase11.add(products02);
         System.out.println(purchase11.addAll(products));
     }

    private static void showTitle() {
        score++;
        System.out.println("--- Purchase Info " + score + " ---");
    }

    private static void showTitle02() {
        System.out.println("----------------------------------\n");
    }
}
