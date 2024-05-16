import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class ProductListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        // Assuming you have a list of products retrieved from Firebase
        List<Product> products = new ArrayList<>();
        // Add products to the list
        
        // Find the ListView
        ListView listView = findViewById(R.id.productListView);
        
        // Create the adapter to convert the array to views
        ProductAdapter adapter = new ProductAdapter(this, products);
        
        // Attach the adapter to a ListView
        listView.setAdapter(adapter);
    }
}
