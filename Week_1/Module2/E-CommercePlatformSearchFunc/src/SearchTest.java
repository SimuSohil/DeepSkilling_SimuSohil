import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Shirt", "Clothing"),
                new Product(3, "Book", "Education"),
                new Product(4, "Phone", "Electronics")
        };

        // Test Linear Search
        Product found1 = SearchUtil.linearSearch(products, "Phone");
        System.out.println("Linear Search: " + (found1 != null ? found1 : "Product not found"));

        // Sort products by name for binary search
        Arrays.sort(products, (a, b) -> a.getProductName().compareToIgnoreCase(b.getProductName()));

        // Test Binary Search
        Product found2 = SearchUtil.binarySearch(products, "Phone");
        System.out.println("Binary Search: " + (found2 != null ? found2 : "Product not found"));
    }
}