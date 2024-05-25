package tw.cchs.bookshop.service;

import tw.cchs.bookshop.dto.ProductQueryParams;
import tw.cchs.bookshop.dto.ProductRequest;
import tw.cchs.bookshop.model.Product;

import java.util.List;

public interface ProductService {

    public Integer createProduct(ProductRequest productRequest);

    public List<Product> getProducts(ProductQueryParams productQueryParams);

    public Product getProductById(Integer productId);

    public void updateProduct(Integer productId, ProductRequest productRequest);

    public void deleteProductById(Integer productId);

}
