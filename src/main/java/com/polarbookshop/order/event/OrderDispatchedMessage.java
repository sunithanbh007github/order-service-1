package com.polarbookshop.order.event;

public record OrderDispatchedMessage(
        Long orderId
) {
}
