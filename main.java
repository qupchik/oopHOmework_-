/**
 * main
 */
public class main {

    public static void main(String[] args) {


        HotDrink product1 = new HotDrink("hotTea", 150, 1, 45);
        HotDrink product2 = new HotDrink("hotCofe", 150, 1, 45);
        HotDrink product3 = new HotDrink("hotTea", 250, 2, 40);
        HotDrink product4 = new HotDrink("hotCofe", 250, 2, 40);
        VendingMachineForHotDrinks Vmachine = new VendingMachineForHotDrinks();
        Vmachine.addProduct(product1);
        Vmachine.addProduct(product2);
        Vmachine.addProduct(product3);
        Vmachine.addProduct(product4);
        System.err.println(Vmachine.getProduct("hotTea", 1, 45).toString());
}
}