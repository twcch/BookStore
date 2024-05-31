package tw.cchs.bookstore.dao;

import tw.cchs.bookstore.dto.ProductQueryParams;
import tw.cchs.bookstore.dto.ProductRequest;
import tw.cchs.bookstore.model.Product;

import java.util.List;

public interface ProductDao {

    public Integer createProduct(ProductRequest productRequest);

    public Product getProductById(Integer productId);

    public List<Product> getProducts(ProductQueryParams productQueryParams);

    public Integer countProduct(ProductQueryParams productQueryParams);

    public void updateProduct(Integer productId, ProductRequest productRequest);

    public void updateStock(Integer productId, Integer stock);

    public void deleteProductById(Integer productId);

}
