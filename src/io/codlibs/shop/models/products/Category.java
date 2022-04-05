package io.codlibs.shop.models.products;

import io.codlibs.shop.annotations.Listener;
import io.codlibs.shop.models.User;

import java.util.List;

public class Category {
    public String id;
    public String name;
    List<Product> products;
    List<Category> categories;

    public void display() {
    }

    @Listener(event = "ADD_PRODUCT_TO_CATEGORY")
    void onProductAddedToCategory(String categoryId, Product product) {

    }

    @Listener(event = "REMOVE_PRODUCT_FROM_CATEGORY")
    void onProductRemovedFromCategory(String categoryId, Product product) {

    }
}
