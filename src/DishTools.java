public class DishTools {
    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    public static void shoutDishName(Dish dish){
        System.out.println(dish.nameOfDish.toUpperCase());
    }

    public static void analyzeDishCost(Dish dish){
        if(dish.costInCents > DishTools.AVERAGE_COST_OF_DISH_IN_CENTS){
            System.out.println("More expensive than average");
        } else {
            System.out.println("Less expensive than average");
        }
    }



    public static boolean flipRecommendation(Dish dish){
        dish.wouldRecommend = !dish.wouldRecommend;
        return dish.wouldRecommend;
    }
}
