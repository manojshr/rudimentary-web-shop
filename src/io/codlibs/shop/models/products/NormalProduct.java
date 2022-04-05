package io.codlibs.shop.models.products;

import io.codlibs.shop.config.EventProducer;
import io.codlibs.shop.models.MessageRequest;

public class NormalProduct extends Product {
    int stockQuantity;

    @Override
    void dispatch() {
        MessageRequest messageRequest = new MessageRequest("DISPATCH_PHYSICALLY", this.id, this);
        EventProducer.send(messageRequest);
        this.reduceQuantity();
    }

    void reduceQuantity() {

    }
}
