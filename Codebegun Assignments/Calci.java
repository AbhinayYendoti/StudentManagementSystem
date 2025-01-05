import java.util.*;
public class Calci {
    public static  int add(int a,int b){
    return a+b;
    }
    public static  int subtraction(int a,int b){
        return a-b;
        }
        public static  int multiplication(int a,int b){
            return a*b;
            }
            public static  int division(int a,int b){
                return a/b;
                }
    public static void main(String[] args){
        int a=67;
        int b=90;
        System.out.println(add(a, b));
        System.out.println(subtraction(a, b));
        System.out.println(multiplication(a, b));
        System.out.println(division(a, b));

    }
    
}
