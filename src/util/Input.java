package util;

import java.util.Scanner;


public class Input {

    private final Scanner sc = new Scanner(System.in);

    public String getString(){
        return sc.next();
    }
    public String getString(String input){
        System.out.println(input);
        return sc.next();
    }

    public boolean yesNo(){
        return (sc.next().equalsIgnoreCase("Y") || sc.next().equalsIgnoreCase("yes"));
    }
    public boolean yesNo(String input){
        System.out.println(input);
        return (sc.next().equalsIgnoreCase("Y") || sc.next().equalsIgnoreCase("yes"));
    }



    public int getInt(int min, int max){
        int currInput = getInt();
        if(currInput > max || currInput < min){
            return getInt(min, max);
        }
        return currInput;
    }
    public int getInt(int min, int max, String input){
        System.out.println(input);
        int currInput = getInt();
        if(currInput > max || currInput < min){
            return getInt(min, max);
        }
        return currInput;
    }

    public int getInt(){
        return sc.nextInt();
    }



    public double getDouble(double min, double max){
        double currDouble = getDouble();
        if(currDouble > max || currDouble < min){
            return getDouble(min, max);
        }
        return currDouble;
    }
    public double getDouble(double min, double max, String input){
        System.out.println(input);
        double currDouble = getDouble();
        if(currDouble > max || currDouble < min){
            return getDouble(min, max);
        }
        return currDouble;
    }

    public double getDouble(){
        return sc.nextDouble();
    }



}
