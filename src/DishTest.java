public class DishTest {
    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.costInCents = 99;
        dish1.nameOfDish = "Patty Melt Deluxe";
        dish1.wouldRecommend = true;
        dish1.printSummary();

        Dish dish2 = new Dish();
        dish2.costInCents = 50;
        dish2.nameOfDish = "Tempura Shrimp Ramen Bowl";
        dish2.wouldRecommend = true;
        dish2.printSummary();

        Dish dish3 = new Dish();
        dish2.costInCents = 150;
        dish2.nameOfDish = "Pasta Carbonara Special";
        dish2.wouldRecommend = true;
        dish2.printSummary();

        DishTools.shoutDishName(dish1);
        DishTools.analyzeDishCost(dish2);
        System.out.println(DishTools.flipRecommendation(dish3));

    }
}
