import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;
import java.util.List;

public class FirebaseHelper {

    private static DatabaseReference mDatabase;

    public static void init() {
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    // Method to fetch products from Firebase
    public static void fetchProducts(final FirebaseCallback<List<Product>> callback) {
        final List<Product> productList = new ArrayList<>();
        mDatabase.child("products").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot productSnapshot : dataSnapshot.getChildren()) {
                    Product product = productSnapshot.getValue(Product.class);
                    productList.add(product);
                }
                callback.onCallback(productList);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Handle error
            }
        });
    }

    // Interface to handle asynchronous callback
    public interface FirebaseCallback<T> {
        void onCallback(T data);
    }
}
