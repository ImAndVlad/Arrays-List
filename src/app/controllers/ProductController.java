package app.controllers;

import app.models.Product;
import app.views.ProductView;

import java.util.ArrayList;
import java.util.List;

public class ProductController {

    ProductView view;

    public ProductController(ProductView view) {
        this.view = view;
    }

    public List<Product> showList() {
        // void add()
        List<Product> purchase = new ArrayList<>();
        purchase.add(view.getProductOne());
        purchase.add(view.getProductTwo());

        return purchase;
    }

    public void runApp() {
        view.showTitle();
        showList();
        view.purchase01(showList());
        view.showTitle02();

        view.showTitle();
        view.purchase02(showList());
        view.showTitle02();

        view.showTitle();
        view.purchase03(showList());
        view.showTitle02();

        view.showTitle();
        view.purchase04(showList());
        view.showTitle02();

        view.showTitle();
        view.purchase05(showList());
        view.showTitle02();

        view.showTitle();
        view.purchase06(showList());
        view.showTitle02();

        view.showTitle();
        view.purchase07(showList());
        view.showTitle02();

        view.showTitle();
        view.purchase08(showList());
        view.showTitle02();

        view.showTitle();
        view.purchase09(showList());
        view.showTitle02();

        view.showTitle();
        view.purchase10(showList());
        view.showTitle02();

        view.showTitle();
        view.purchase11(showList());
        view.showTitle02();
    }
}
