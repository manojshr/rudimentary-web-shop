package io.codlibs.shop.models.products;

import io.codlibs.shop.config.EventProducer;
import io.codlibs.shop.models.MessageRequest;

public class DigitalProduct extends Product {
    @Override
    void dispatch() {
        MessageRequest messageRequest = new MessageRequest("DISPATCH_DIGITALLY", this.id, this);
        EventProducer.send(messageRequest);
    }
}
