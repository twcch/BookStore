package tw.cchs.bookshop.dto;

import tw.cchs.bookshop.constant.ProductCategory;

public class ProductQueryParams {

    private ProductCategory category;
    private String search;

    public ProductQueryParams() {

    }

    public ProductQueryParams(ProductCategory category, String search) {
        this.category = category;
        this.search = search;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return "ProductQueryParams{" +
                "category=" + category +
                ", search='" + search + '\'' +
                '}';
    }

}
