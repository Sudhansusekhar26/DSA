import java.util.Scanner;

public class avg {
    // input 3 num find avg

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int Avg = (A+B+C)/3;
        
        System.out.println(Avg);
    }
    
}
