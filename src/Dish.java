public class Dish {
     public int costInCents = 0;
     public String nameOfDish;
     public boolean wouldRecommend;
     public  void printSummary(){
            System.out.printf("Cost: " + costInCents + "\nName: " + nameOfDish + "\nRecommended: " + wouldRecommend);
        }
}
