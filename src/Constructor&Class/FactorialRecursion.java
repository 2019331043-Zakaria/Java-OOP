class dp{

     int fact(int n){
         if(n==1)
             return  1;
         else
             return  n*fact(n-1);
     }
}

public class FactorialRecursion {

     public  static void main(String[] args ){

             dp CountFact =new dp();

         System.out.println(CountFact.fact(5));


     }

}
