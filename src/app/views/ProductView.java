package app.views;

import app.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductView {

    Product model;
    int score;

    public ProductView(Product model) {
        this.model = model;
    }

    public Product getProductOne() {
        Product product = new Product();
        product.name = "Orange";
        product.quantity = 15;

        return product;
    }

    public Product getProductTwo() {
        Product product02 = new Product();
        product02.name = "Pear";
        product02.quantity = 10;

        return product02;
    }

    public Product getProductThree() {
        Product product03 = new Product();
        product03.name = "Cherry";
        product03.quantity = 4;

        return product03;
    }

    public void purchase01(List<Product> products) {
        // boolean add()
        System.out.println(products.add(getProductThree()));
    }

    public void purchase02(List<Product> products) {
        // void add()
        List<Product> purchase02 = new ArrayList<>(products);
        purchase02.add(0, getProductThree());

        System.out.println(purchase02);
    }

    public void purchase03(List<Product> products) {
        // void clear()
        List<Product> purchase03 = new ArrayList<>(products);
        purchase03.clear();

        System.out.println(purchase03);
    }

    public void purchase04(List<Product> products) {
        // int get()
        List<Product> purchase04 = new ArrayList<>(products);
        purchase04.add(getProductThree());

        System.out.println(purchase04.get(2));
    }

    public void purchase05(List<Product> products) {
        // boolean isEmpty()
        System.out.println(products.isEmpty());
    }

    public void purchase06(List<Product> products) {
        // boolean remove()
        System.out.println(products.remove(getProductOne()));
    }

    public void purchase07(List<Product> products) {
        // remove()
        System.out.println(products.remove(0));
    }

    public void purchase08(List<Product> products) {
        // set()
        List<Product> purchase07 = new ArrayList<>(products);
        purchase07.set(1, new Product());

        System.out.println(purchase07);
    }

    public void purchase09(List<Product> products) {
        // int size()
        System.out.println(products.size());
    }

    public void purchase10(List<Product> products) {
        // IntList subList()
        List<Product> purchase09 = new ArrayList<>(products);
        purchase09.add(getProductThree());

        System.out.println(purchase09.subList(1, 3));
    }

    public void purchase11(List<Product> products) {
        // boolean addAll()
        Product products02 = new Product();
        products02.name = "Milk";
        products02.quantity = 33;

        List<Product> purchase11 = new ArrayList<>();
        purchase11.add(products02);
        System.out.println(purchase11.addAll(products));
    }

    public void showTitle() {
        score++;
        System.out.println("--- Purchase Info " + score + " ---");
    }

    public void showTitle02() {
        System.out.println("----------------------------------\n");
    }
}
