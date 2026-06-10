public class LogicalOp {
     public static void main(String[] args) {
    System.out.println("AND &&");
  int a= 10 ;
  int b= 5 ; 
  System.out.println(a>b && a>b); // T - T -> T
  System.out.println(a<b && a<b); // F - F -> F
  System.out.println(a<b && a>b); // F - T -> F
  System.out.println(a>b && a<b); // T - F -> F

    System.out.println("OR || ");
  System.out.println(a>b || a>b); // T - T -> T
  System.out.println(a<b || a<b); // F - F -> F
  System.out.println(a<b || a>b); // F - T -> T
  System.out.println(a>b || a<b); // T - F -> T

       System.out.println("NOT !");
  System.out.println( !(a>b) ); // ! T -> F  , !F -> T 
  

 }   
}
