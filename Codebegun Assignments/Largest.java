import java.util.*;
public class Largest {
    public static int Findlargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];

            }
        }
        return largest;
    }
    public static void main(String[] args){
        int arr[]={3,8,7,5,9};
        System.out.println(Findlargest(arr));
    }
    
}
