package movie.order.service;


import movie.order.model.OrderCreateRequest;
import movie.order.model.OrderCreateResponse;
import movie.order.entity.Order;
import movie.order.util.OrderAction;

import java.math.BigInteger;

public interface OrderService {
    OrderCreateResponse createOrder(OrderCreateRequest request) throws Exception;

    Order cancelOrder(BigInteger orderId) throws IllegalStateException;

    Order updateOrderAction(BigInteger orderId, OrderAction newStatus) throws IllegalStateException;

}
