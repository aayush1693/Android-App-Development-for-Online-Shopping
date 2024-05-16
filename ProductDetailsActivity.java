import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_details);

        // Retrieve the product details passed from the previous activity
        Product product = (Product) getIntent().getSerializableExtra("product");

        // Display product details
        if (product != null) {
            ImageView productImage = findViewById(R.id.product_image);
            TextView productName = findViewById(R.id.product_name);
            TextView productDescription = findViewById(R.id.product_description);
            TextView productPrice = findViewById(R.id.product_price);

            // Set product details to respective views
            productImage.setImageResource(R.drawable.default_product_image); // Replace with actual image loading
            productName.setText(product.getName());
            productDescription.setText(product.getDescription());
            productPrice.setText(String.valueOf(product.getPrice()));
        }
    }
}
