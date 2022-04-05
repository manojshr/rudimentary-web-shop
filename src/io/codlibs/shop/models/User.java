package io.codlibs.shop.models;


import io.codlibs.shop.config.EventProducer;
import io.codlibs.shop.models.products.Category;
import io.codlibs.shop.models.products.Product;
import io.codlibs.shop.notifier.EmailNotifier;
import io.codlibs.shop.notifier.Subscription;

public class User {
    String id;
    String name;
    Address address;

    public User() {
        //Additional Subscriptions
        this.subscribe(new EmailNotifier());
    }

    void addProduct(Product product) {
        MessageRequest messageRequest = new MessageRequest("ADD_PRODUCT_TO_CART", this.id, product);
        EventProducer.send(messageRequest);
    }

    void removeProduct(Product product) {
        MessageRequest messageRequest = new MessageRequest("REMOVE_PRODUCT_FROM_CART", this.id, product);
        EventProducer.send(messageRequest);
    }

    void subscribe(Subscription subscription) {

    }

    void displayCategory(Category category) {
        category.display();
    }
}
