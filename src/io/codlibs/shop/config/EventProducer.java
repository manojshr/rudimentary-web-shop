package io.codlibs.shop.config;

import io.codlibs.shop.models.MessageRequest;

/**
 * Can be a Kafka Producer
 */
public class EventProducer {

    public static boolean send(MessageRequest messageRequest) {
        return true;
    }
}
