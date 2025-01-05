public class Fibonacci {
    public static void Findfibo(){

        
        int n=6;
        int firstnum=0,secondnum=1;
        System.out.print(firstnum + "," + secondnum);
        for(int i=2;i<=n;i++){
            int nextnum=firstnum+secondnum;
            firstnum=secondnum;
            secondnum=nextnum;
            System.out.print(","+nextnum);
        }
        
       
    }
    public static void main(String[] args){
        Findfibo();

    }
    
}
