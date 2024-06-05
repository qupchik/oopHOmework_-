import java.util.List;

public interface VendingMachine {

    void initProducts(List<BottleOfWater> products);

    void addProduct (BottleOfWater product);

    BottleOfWater getProduct (String name);
    
}
