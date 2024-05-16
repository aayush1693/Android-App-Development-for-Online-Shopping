import androidx.lifecycle.ViewModel;

public class ProductDetailsViewModel extends ViewModel {
    private Product product;

    public ProductDetailsViewModel(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getProductName() {
        return product.getName();
    }

    public String getProductDescription() {
        return product.getDescription();
    }

    public double getProductPrice() {
        return product.getPrice();
    }

    public String getProductImageUrl() {
        return product.getImageUrl();
    }

    public String getProductCategory() {
        return product.getCategory();
    }

    public void setProductName(String name) {
        product.setName(name);
    }

    public void setProductDescription(String description) {
        product.setDescription(description);
    }

    public void setProductPrice(double price) {
        product.setPrice(price);
    }

    public void setProductImageUrl(String imageUrl) {
        product.setImageUrl(imageUrl);
    }

    public void setProductCategory(String category) {
        product.setCategory(category);
    }

    public void updateProduct(Product updatedProduct) {
        product = updatedProduct;
    }

    public void deleteProduct() {
        product = null;
    }

    public boolean isProductAvailable() {
        return product != null;
    }

    public boolean isProductCategory(String category) {
        return product.getCategory().equals(category);
    }

    public boolean isProductPriceInRange(double minPrice, double maxPrice) {
        return product.getPrice() >= minPrice && product.getPrice() <= maxPrice;
    }

    public boolean isProductPriceLessThan(double price) {
        return product.getPrice() < price;
    }

    public boolean isProductPriceGreaterThan(double price) {
        return product.getPrice() > price;
    }

    public boolean isProductPriceEqualTo(double price) {
        return product.getPrice() == price;
    }

    public boolean isProductPriceNotEqualTo(double price) {
        return product.getPrice() != price;
    }

    public boolean isProductPriceLessThanOrEqualTo(double price) {
        return product.getPrice() <= price;
    }

    public boolean isProductPriceGreaterThanOrEqualTo(double price) {
        return product.getPrice() >= price;
    }

    public boolean isProductPriceBetween(double minPrice, double maxPrice) {
        return product.getPrice() > minPrice && product.getPrice() < maxPrice;
    }

    public boolean isProductPriceNotBetween(double minPrice, double maxPrice) {
        return product.getPrice() <= minPrice || product.getPrice() >= maxPrice;
    }

    public boolean isProductPricePositive() {
        return product.getPrice() > 0;
    }

    public boolean isProductPriceNegative() {
        return product.getPrice() < 0;
    }

    public boolean isProductPriceZero() {
        return product.getPrice() == 0;
    }

    public boolean isProductPriceNonZero() {
        return product.getPrice() != 0;
    }

    public boolean isProductPriceEven() {
        return product.getPrice() % 2 == 0;
    }

    public boolean isProductPriceOdd() {
        return product.getPrice() % 2 != 0;
    }

    public boolean isProductPriceDivisibleBy(int divisor) {
        return product.getPrice() % divisor == 0;
    }

    public boolean isProductPriceNotDivisibleBy(int divisor) {
        return product.getPrice() % divisor != 0;
    }

    public boolean isProductPriceMultipleOf(int multiple) {
        return product.getPrice() % multiple == 0;
    }

}