import java.util.*;
public class ArraySum {
    public static void main(String[] args){
        int arr[]={3,8,6,9,56};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("the sum of array is:"+sum);
    }
    
}
