package tw.cchs.bookstore.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import tw.cchs.bookstore.dao.OrderDao;
import tw.cchs.bookstore.dto.OrderQueryParams;
import tw.cchs.bookstore.model.Order;
import tw.cchs.bookstore.model.OrderItem;
import tw.cchs.bookstore.rowmapper.OrderItemRowMapper;
import tw.cchs.bookstore.rowmapper.OrderRowMapper;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class OrderDaoImpl implements OrderDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public Integer createOrder(Integer userId, Integer totalAmount) {

        String sql = "INSERT INTO `order` (user_id, total_amount, created_date, last_modified_date) " +
                "VALUES (:userId, :totalAmount, :createdDate, :lastModifiedDate)";

        Map<String, Object> map = new HashMap<>();
        map.put("userId", userId);
        map.put("totalAmount", totalAmount);

        Date rightNow = new Date();
        map.put("createdDate", rightNow);
        map.put("lastModifiedDate", rightNow);

        KeyHolder keyHolder = new GeneratedKeyHolder();

        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource(map), keyHolder);

        int orderId = keyHolder.getKey().intValue();

        return orderId;

    }

    @Override
    public void createOrderItems(Integer orderId, List<OrderItem> orderItems) {

//        // 使用 for loop 一條一條 sql 加入數據，效率較低
//        for (OrderItem orderItem : orderItems) {
//
//            String sql = "INSERT INTO order_item (order_id, product_id, quantity, amount) " +
//                    "VALUES (:orderId, :productId, :quantity, :amount)";
//
//            Map<String, Object> map = new HashMap<>();
//            map.put("orderId", orderId);
//            map.put("productId", orderItem.getProductId());
//            map.put("quantity", orderItem.getQuantity());
//            map.put("amount", orderItem.getAmount());
//
//            namedParameterJdbcTemplate.update(sql, map);
//
//        }

        // 使用 batchUpdate 一次性加入數據，效率更高
        String sql = "INSERT INTO order_item (order_id, product_id, quantity, amount) " +
                "VALUES (:orderId, :productId, :quantity, :amount)";

        MapSqlParameterSource[] mapSqlParameterSources = new MapSqlParameterSource[orderItems.size()];

        for (int i = 0; i < orderItems.size(); i++) {

            OrderItem orderItem = orderItems.get(i);

            mapSqlParameterSources[i] = new MapSqlParameterSource();
            mapSqlParameterSources[i].addValue("orderId", orderId);
            mapSqlParameterSources[i].addValue("productId", orderItem.getProductId());
            mapSqlParameterSources[i].addValue("quantity", orderItem.getQuantity());
            mapSqlParameterSources[i].addValue("amount", orderItem.getAmount());

        }

        namedParameterJdbcTemplate.batchUpdate(sql, mapSqlParameterSources);

    }

    @Override
    public Order getOrderById(Integer orderId) {

        String sql = "SELECT order_id, user_id, total_amount, created_date, last_modified_date " +
                "FROM `order` WHERE order_id = :orderId";

        Map<String, Object> map = new HashMap<>();
        map.put("orderId", orderId);

        List<Order> orderList = namedParameterJdbcTemplate.query(sql, map, new OrderRowMapper());

        if (orderList.size() > 0) {
            return orderList.get(0);
        } else {
            return null;
        }

    }

    @Override
    public List<OrderItem> getOrderItemsByOrderId(Integer orderId) {

        String sql = "SELECT oi.order_item_id, oi.order_id, oi.product_id, oi.quantity, oi.amount, p.product_name, " +
                "p.image_url FROM order_item as oi " +
                "LEFT JOIN product as p ON oi.product_id = p.product_id " +
                "WHERE oi.order_id = :orderId";

        Map<String, Object> map = new HashMap<>();
        map.put("orderId", orderId);

        List<OrderItem> orderItemList = namedParameterJdbcTemplate.query(sql, map, new OrderItemRowMapper());

        return orderItemList;

    }

    @Override
    public List<Order> getOrders(OrderQueryParams orderQueryParams) {

        String sql = "SELECT order_id, user_id, total_amount, created_date, last_modified_date FROM `order` WHERE 1=1";

        Map<String, Object> map = new HashMap<>();

        // 查詢條件
        sql = addFilteringSql(sql, map, orderQueryParams);

        // 排序
        sql = sql + " ORDER BY created_date DESC";

        // 分頁
        sql = sql + " LIMIT :limit OFFSET :offset";
        map.put("limit", orderQueryParams.getLimit());
        map.put("offset", orderQueryParams.getOffset());

        List<Order> orderList = namedParameterJdbcTemplate.query(sql, map, new OrderRowMapper());

        return orderList;

    }

    @Override
    public Integer countOrder(OrderQueryParams orderQueryParams) {

        String sql = "SELECT count(*) FROM `order` WHERE 1=1";

        Map<String, Object> map = new HashMap<>();

        // 查詢條件
        sql = addFilteringSql(sql, map, orderQueryParams);

        Integer total = namedParameterJdbcTemplate.queryForObject(sql, map, Integer.class);

        return total;

    }

    private String addFilteringSql(String sql, Map<String, Object> map, OrderQueryParams orderQueryParams) {

        if (orderQueryParams.getUserId() != null) {
            sql = sql + " AND user_id = :userId";
            map.put("userId", orderQueryParams.getUserId());
        }

        return sql;

    }

}
