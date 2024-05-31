package tw.cchs.bookstore.constant;

public enum ProductCategory {

    CHINESE_BOOK(0),
    FOREIGN_BOOK(1),
    E_BOOK(2);

    private Integer productCategoryId;

    private ProductCategory(Integer productCategoryId) {

        this.productCategoryId = productCategoryId;

    }

}
