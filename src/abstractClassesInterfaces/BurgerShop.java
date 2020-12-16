package abstractClassesInterfaces;

import java.util.List;

// BurgerShop will be the "San Antonio" installation of a "Franchise"
public class BurgerShop extends Franchise {
    // This will be an actual McDonald's store
    // It has to follow all the rules set in the "Franchise" abstract class

    // properties (can have as many customer as we want)
    private List<String> menuItems;
    private List<String> menuCategories;
    private int seatingCapacity;
    private int openTime;
    private int closeTime;
    private boolean iceCreamTime;


    // Constructor ('ctrl + enter', select all)
    public BurgerShop(String managerName, List<String> menuItems, List<String> menuCategories, int seatingCapacity, int openTime, int closeTime, boolean iceCreamTime) {
        // managerName is in the superclass (Franchise)
        super(managerName);
        this.menuItems = menuItems;
        this.menuCategories = menuCategories;
        this.seatingCapacity = seatingCapacity;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.iceCreamTime = iceCreamTime;
    }

    // Override the methods that have to be written, per the 'Franchise' abstract class
    public void broilStuff(String menuItem){
        System.out.println("The kitchen just cooked up a " + menuItem);
    }

    @Override
    public void businessHours(int openTime, int closeTime){
        System.out.println("We open at " + openTime + " and close at " + closeTime);
    }

    @Override
    public boolean iceCreamMachineWorking() {
        // This could just be replaced by a getter, but we could also check if the store is open, then return true

        if (this.openTime > 100) {
            return this.iceCreamTime;
        }
        return false;
    }

    @Override
    public String getCompanyName() {
        return super.getCompanyName();
    }

    public static void main(String[] args) {
//        BurgerShop myShop = new BurgerShop();
    }
        // Getters & Setters


}
