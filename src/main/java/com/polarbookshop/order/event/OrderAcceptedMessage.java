package com.polarbookshop.order.event;

public record OrderAcceptedMessage(
        Long orderId
) {
}
