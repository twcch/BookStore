package tw.cchs.bookshop.dao;

import tw.cchs.bookshop.dto.ProductRequest;
import tw.cchs.bookshop.model.Product;

public interface ProductDao {

    public Integer createProduct(ProductRequest productRequest);

    public Product getProductById(Integer productId);

}
