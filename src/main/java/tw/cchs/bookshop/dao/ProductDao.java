package tw.cchs.bookshop.dao;

import tw.cchs.bookshop.dto.ProductQueryParams;
import tw.cchs.bookshop.dto.ProductRequest;
import tw.cchs.bookshop.model.Product;

import java.util.List;

public interface ProductDao {

    public Integer createProduct(ProductRequest productRequest);

    public List<Product> getProducts(ProductQueryParams productQueryParams);

    public Product getProductById(Integer productId);

    public void updateProduct(Integer productId, ProductRequest productRequest);

    public void deleteProductById(Integer productId);

    public Integer countProduct(ProductQueryParams productQueryParams);

}
