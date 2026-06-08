import java.util.Scanner;

public class q3 {
    /*   Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem */

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float pencil = sc.nextFloat() ;
    float pen = sc.nextFloat() ;
    float eraser = sc.nextFloat() ;
    
float bill = pencil + pen + eraser ; 
System.out.println("total bill : "+bill);

float fbill= bill + (0.18f * bill);
System.out.println("total bill with 18 % tax : "+fbill);
}
}
