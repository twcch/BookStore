package tw.cchs.bookshop.service;

import tw.cchs.bookshop.dto.CreateOrderRequest;
import tw.cchs.bookshop.dto.OrderQueryParams;
import tw.cchs.bookshop.model.Order;

import java.util.List;

public interface OrderService {

    public Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    public Order getOrderById(Integer orderId);

    public List<Order> getOrders(OrderQueryParams orderQueryParams);

    public Integer countOrder(OrderQueryParams orderQueryParams);

}
