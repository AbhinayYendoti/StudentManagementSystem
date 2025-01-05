public class Prime {
  
    public static boolean isprime(int n){
        
        if(n<1){
        return false;
        }else if(n>1){
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n% i==0){
                    return false;
                }else{
                    return true;
                }
            }
        }
    
    public static void main(String[] args){
        int n=8;

        if(isprime(n)){
            System.out.println("it is a prime num");
        }else{
            System.out.println("it is not a prime num");
        }


    }
    
}
