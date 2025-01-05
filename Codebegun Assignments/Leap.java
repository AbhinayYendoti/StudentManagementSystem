import java.util.*;
public class Leap {
    public static void Finfleapyear(){
        int year=2004;
        if(year % 4 ==0 && year % 400 ==0 ){
            System.out.println("it is a leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }
    public static void main(String args[]){
        Finfleapyear();
        

    }
    
}
