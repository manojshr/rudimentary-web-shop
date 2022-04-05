package io.codlibs.shop.models;

import io.codlibs.shop.annotations.Listener;
import io.codlibs.shop.models.products.Product;

import java.util.List;

public class ShoppingCart {

    List<Product> productList;

    @Listener(event = "ADD_PRODUCT_TO_CART")
    void onProductAdd(User userId, Product product) {

    }

    @Listener(event = "REMOVE_PRODUCT_FROM_CART")
    void onProductRemove(User userId, Product product) {

    }

    @Listener(event = "UPDATE_PRODUCT_IN_CART")
    void onProductUpdate(User userId, Product product) {

    }

}
