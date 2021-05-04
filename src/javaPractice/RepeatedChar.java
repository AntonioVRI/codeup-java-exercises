package javaPractice;

public class RepeatedChar {

    public static String unrepeated(String str) {
        String x="";
        for(int i = 0;i<str.length(); i++){
            if(!x.contains(str.substring(i,i+1))){
                x+= str.substring(i,i+1);
            }
        }
        return x;
    }
}
