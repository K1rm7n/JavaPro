package HW10;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductOperations {
    public List<Product> filterBooksAbovePrice(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book") && product.getPrice() > 250)
                .collect(Collectors.toList());
    }
    public List<Product> applyDiscountForBooks(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book") && product.isDiscount())
                .map(product -> {
                    double discountedPrice = product.getPrice() * 0.9; // Applying 10% discount
                    product.setPrice(discountedPrice);
                    return product;
                })
                .collect(Collectors.toList());
    }
    public Product findCheapestBook(List<Product> products) {
        Optional<Product> cheapestBook = products.stream()
                .filter(product -> product.getType().equals("Book"))
                .min(Comparator.comparing(Product::getPrice));

        return cheapestBook.orElseThrow(() -> new RuntimeException("Product [category: Book] not found"));
    }
    public List<Product> getLastThreeAddedProducts(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getCreateDate).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
    public double calculateTotalCostOfBooks(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getCreateDate().getYear() == LocalDate.now().getYear())
                .filter(product -> product.getPrice() <= 75)
                .mapToDouble(Product::getPrice)
                .sum();
    }
    public Map<String, List<Product>> groupProductsByType(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }
}