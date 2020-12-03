public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;

        while (i <= 15) {

            System.out.print(i);
            System.out.print(" ");
            i += 1;
        }

//            int counter = 0;
//
//            do{
//                System.out.println(counter);
//                counter += 2;
//            }while(counter <= 100);

//            int counter = 100;
//
//            do{
//                System.out.println(counter);
//                counter -= 5;
//            }while(counter >= -10);

//            long start = 2L;
//
//            do{
//                System.out.println(start);
//                start *= start;
//            }while (start < 1000000L);


//            FIZZBUZZ WHITEBOARD EXAMPLE

        //  Fizz - 3
        //  Buzz - 5
        //  FizzBuzz = 15
            for(i = 0; i <= 100; i += 1){
                if(i % 15 == 0){
                    System.out.println("FizzBuzz");
                }else if(i % 5 == 0){
                    System.out.println("Buzz");
                }else if(i % 3 == 0){
                    System.out.println("Fizz");
                }else {
                    System.out.println(i);
                }
            }
    }
}
