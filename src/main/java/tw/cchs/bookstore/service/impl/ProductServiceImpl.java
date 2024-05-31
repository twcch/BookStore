package tw.cchs.bookstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tw.cchs.bookstore.dao.ProductDao;
import tw.cchs.bookstore.dto.ProductQueryParams;
import tw.cchs.bookstore.dto.ProductRequest;
import tw.cchs.bookstore.model.Product;
import tw.cchs.bookstore.service.ProductService;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Integer createProduct(ProductRequest productRequest) {

        return productDao.createProduct(productRequest);

    }

    @Override
    public Product getProductById(Integer productId) {

        return productDao.getProductById(productId);

    }

    @Override
    public List<Product> getProducts(ProductQueryParams productQueryParams) {

        return productDao.getProducts(productQueryParams);

    }

    @Override
    public Integer countProduct(ProductQueryParams productQueryParams) {

        return productDao.countProduct(productQueryParams);

    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {

        productDao.updateProduct(productId, productRequest);

    }

    @Override
    public void deleteProductById(Integer productId) {

        productDao.deleteProductById(productId);

    }

}
