package io.codlibs.shop.models;

import io.codlibs.shop.annotations.Listener;
import io.codlibs.shop.config.EventProducer;
import io.codlibs.shop.models.products.Category;
import io.codlibs.shop.models.products.Product;
import io.codlibs.shop.notifier.EmailNotifier;
import io.codlibs.shop.notifier.Subscription;

public class Seller {
    String name;

    public Seller() {
        //Additional Subscriptions
        this.subscribe(new EmailNotifier());
    }

    @Listener(event = "DISPATCH_PHYSICALLY")
    void onProductDispatchPhysically(String productId, Product product) {

    }

    @Listener(event = "DISPATCH_DIGITALLY")
    void onProductDispatchDigitally(String productId, Product product) {
        // String link = getDownloadableSecureLink();
        // sendEmail(link);
    }

    void addProductToCategory(Category category, Product product) {
        MessageRequest messageRequest = new MessageRequest("ADD_PRODUCT_TO_CATEGORY", category.id, product);
        EventProducer.send(messageRequest);
    }

    void removeProductFromCategory(Category category, Product product) {
        MessageRequest messageRequest = new MessageRequest("REMOVE_PRODUCT_FROM_CATEGORY", category.id, product);
        EventProducer.send(messageRequest);
    }

    void subscribe(Subscription subscription) {

    }
}
