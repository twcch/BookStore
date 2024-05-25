package tw.cchs.bookshop.service;

import tw.cchs.bookshop.dto.ProductRequest;
import tw.cchs.bookshop.model.Product;

public interface ProductService {

    public Integer createProduct(ProductRequest productRequest);

    public Product getProductById(Integer productId);

    public void updateProduct(Integer productId, ProductRequest productRequest);

}
