import java.util.ArrayList;
import java.util.List;

public class VendingMachineForHotDrinks implements VendingMachine{

    private List<BottleOfWater> products;
    
    public VendingMachineForHotDrinks(){
        products = new ArrayList();
    }

    @Override
    public void initProducts(List<BottleOfWater> products){
        this.products = products;
    }
    @Override
    public void addProduct (BottleOfWater product){
        products.add(product);
    }
    @Override
    public BottleOfWater getProduct (String name){
        for (BottleOfWater product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public BottleOfWater getProduct (String string, int volume, int temperature){
        for (BottleOfWater product : products) {
            if (product.getName().equals(string) && product.getVolume() == volume && ((HotDrink)product).getTemperature() == temperature) {
                return product;
            }
        }
        return null;
    }
}


