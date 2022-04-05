package io.codlibs.shop.models.products;

import io.codlibs.shop.config.EventProducer;
import io.codlibs.shop.models.Image;
import io.codlibs.shop.models.MessageRequest;
import io.codlibs.shop.models.Price;

import java.util.List;

public abstract class Product {
    String id;
    String name;
    String articleNumber;
    List<Price> prices;
    List<Image> images;

    abstract void dispatch();

    void priceDrop() {
        MessageRequest messageRequest = new MessageRequest("PRICE_DROP", this.id, this.name);
        EventProducer.send(messageRequest);
    }
}
