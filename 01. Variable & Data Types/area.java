import java.util.Scanner;

public class area {
    // area of circle 

    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(); 
        float f = 3.14f;
        float ARC = f * R * R ;
        System.out.println(ARC);
    }
    
}
