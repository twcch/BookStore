package tw.cchs.bookshop.service;

import tw.cchs.bookshop.dto.CreateOrderRequest;

public interface OrderService {

    public Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
