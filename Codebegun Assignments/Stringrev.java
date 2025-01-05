public class Stringrev {
    public static void main(String args[]){
        String a ="Abhinay";
        StringBuilder ab= new StringBuilder(a);
        
       String rev =ab.reverse().toString();
       System.out.println(rev);


       if(rev == a){
        System.out.println("it is a palinndrome");
       }else{
        System.out.println("not a palindrome");
       }
    }
    
}
