package app;

import app.controllers.ProductController;
import app.models.Product;
import app.views.ProductView;

public class App {

    public static void main(String[] args) {
        Product model = new Product();
        ProductView view = new ProductView(model);
        ProductController controller = new ProductController(view);

        controller.runApp();
    }
}
