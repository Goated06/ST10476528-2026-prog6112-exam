import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ProductTest {
    String[] names = {"A", "B", "C"};
    int[][] sales = {{25, 18, 20}, {15, 10, 20}, {18, 15, 20}};
    Product p = new Product(names, sales);

    public void GetTotalProductSold_WithValidData_ReturnsCorrectValue() {
        assertEquals(153, p.GetTotalProductSold());
    }

    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        assertEquals(17.0, p.GetAverageProductSold(), 0.01);

    }
}