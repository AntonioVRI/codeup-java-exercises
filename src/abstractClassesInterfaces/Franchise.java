package abstractClassesInterfaces;

// Declaring this to be an abstract class
public abstract class Franchise {
/* Methods in an abstract class are like a list of rules or
   requirements for what needs to be implemented in any class
   that extends this abstract class
*/

//   If we create a class that extends a Franchise
//   i.e. McDonald's on I-10 vs McDonald's on Loop 1604

//   Properties (constant values)
    private final String companyName = "McDonald's"; // this is always
    // the same, no matter where we build a franchise location

    private String managerName;

    // If we have enough properties to warrant a constructor - to set those
    // values when initializing this class - create it here
    public Franchise(String managerName){
        this.managerName = managerName;
    }

    // Methods
    public abstract void broilStuff(String menuItem); // broilStuff("bigMac")

    // 8am = 800, 10pm = 2200
    public abstract void businessHours(int openTime, int closeTime);

    // non-void method
    public abstract boolean iceCreamMachineWorking();

    // non-abstract method
    public void greetCustomer() {
        // have to write out the method body, because we did NOT use the
        // abstract keyword when declaring the method
        System.out.println("Welcome to McDonald's. Enjoy your meal!");
    }

//    Static
//    double result = Math.pow(10, 2);
//    Non-Static
//    Math myCoolMathTool = new Math(); // this tries to create another instance of 'Math', not allowed

    // Getter / Setter
    public String getCompanyName(){
        return companyName; // can retrieve this from any class that extends
        // this abstract class, even though it's declared private
    }





}
