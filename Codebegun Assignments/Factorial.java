public class Factorial{

    public static int findFac(){
     int n=5;
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial *= i;
        }
        return factorial;

    }
    public static void main(String args[]){
        
       System.out.println(findFac());

    }
}