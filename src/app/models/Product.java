package app.models;

public class Product {

    public String name;
    public int quantity;

    @Override
    public String toString() {
        return "\nProduct name: " + name +
                "\tquantity: " + quantity + " pcs.";
    }
}
