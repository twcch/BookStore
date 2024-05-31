package tw.cchs.bookstore.service;

import tw.cchs.bookstore.dto.ProductQueryParams;
import tw.cchs.bookstore.dto.ProductRequest;
import tw.cchs.bookstore.model.Product;

import java.util.List;

public interface ProductService {

    public Integer createProduct(ProductRequest productRequest);

    public Product getProductById(Integer productId);

    public List<Product> getProducts(ProductQueryParams productQueryParams);

    public Integer countProduct(ProductQueryParams productQueryParams);

    public void updateProduct(Integer productId, ProductRequest productRequest);

    public void deleteProductById(Integer productId);

}
