package tw.cchs.bookstore.dao;

import tw.cchs.bookstore.dto.OrderQueryParams;
import tw.cchs.bookstore.model.Order;
import tw.cchs.bookstore.model.OrderItem;

import java.util.List;

public interface OrderDao {

    public Integer createOrder(Integer userId, Integer totalAmount);

    public void createOrderItems(Integer orderId, List<OrderItem> orderItems);

    public Order getOrderById(Integer orderId);

    public List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    public List<Order> getOrders(OrderQueryParams orderQueryParams);

    public Integer countOrder(OrderQueryParams orderQueryParams);

}
