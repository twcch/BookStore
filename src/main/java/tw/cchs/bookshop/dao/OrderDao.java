package tw.cchs.bookshop.dao;

import tw.cchs.bookshop.model.OrderItem;

import java.util.List;

public interface OrderDao {

    public Integer createOrder(Integer userId, Integer totalAmount);

    public void creatOrderItems(Integer orderId, List<OrderItem> orderItems);

}
