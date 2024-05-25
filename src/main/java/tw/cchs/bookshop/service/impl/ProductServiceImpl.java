package tw.cchs.bookshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tw.cchs.bookshop.dao.ProductDao;
import tw.cchs.bookshop.dto.ProductQueryParams;
import tw.cchs.bookshop.dto.ProductRequest;
import tw.cchs.bookshop.model.Product;
import tw.cchs.bookshop.service.ProductService;

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
    public List<Product> getProducts(ProductQueryParams productQueryParams) {

        return productDao.getProducts(productQueryParams);

    }

    @Override
    public Product getProductById(Integer productId) {

        return productDao.getProductById(productId);

    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {

        productDao.updateProduct(productId, productRequest);

    }

    @Override
    public void deleteProductById(Integer productId) {

        productDao.deleteProductById(productId);

    }

    @Override
    public Integer countProduct(ProductQueryParams productQueryParams) {

        return productDao.countProduct(productQueryParams);

    }

}
