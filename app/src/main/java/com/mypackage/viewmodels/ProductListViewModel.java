import androidx.lifecycle.ViewModel;
import java.util.List;

public class ProductListViewModel extends ViewModel {
    private List<Product> products;

    public ProductListViewModel(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void clearProducts() {
        products.clear();
    }

    public void updateProduct(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == product.getId()) {
                products.set(i, product);
                break;
            }
        }
    }

    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public Product getProductByIndex(int index) {
        return products.get(index);
    }

    public int getProductCount() {
        return products.size();
    }

    public void removeProductById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                break;
            }
        }
    }

    public void removeProductByIndex(int index) {
        products.remove(index);
    }

    public void addProductByIndex(int index, Product product) {
        products.add(index, product);
    }

    public void updateProductByIndex(int index, Product product) {
        products.set(index, product);
    }
      
}
    