package app.models;

public class Product {

    public String name;
    public int quantity;
    static int score;

    @Override
    public String toString() {
        score++;
        return "\nProduct №" + score +
                "\t name: " + name + " " +
                "\t quantity: " + quantity;
    }
}
