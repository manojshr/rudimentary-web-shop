package io.codlibs.shop.notifier;

import io.codlibs.shop.annotations.Listener;
import io.codlibs.shop.models.products.Product;

public class EmailNotifier implements Subscription {

    @Listener(event = "PRICE_DROP")
    void onPriceDrop(Product product, double newPrice) {

    }
}
