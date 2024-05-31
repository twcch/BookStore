package tw.cchs.bookstore.service;

import tw.cchs.bookstore.dto.CreateOrderRequest;
import tw.cchs.bookstore.dto.OrderQueryParams;
import tw.cchs.bookstore.model.Order;

import java.util.List;

public interface OrderService {

    public Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    public Order getOrderById(Integer orderId);

    public List<Order> getOrders(OrderQueryParams orderQueryParams);

    public Integer countOrder(OrderQueryParams orderQueryParams);

}
