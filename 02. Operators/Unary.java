public class Unary {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a; // pre increment
         System.out.println("pre increment");
         System.out.println(a);
         System.out.println(b);

        int c = 10;
        int d= c++; // post increment
         System.out.println("post increment");
         System.out.println(c);
         System.out.println(d);

        int e = 10;
        int f = --a; // pre decrement
         System.out.println("pre decrement");
         System.out.println(e);
         System.out.println(f);

        int g = 10;
        int h= g++; // post decrement
         System.out.println("post decrement");
         System.out.println(g);
         System.out.println(h);

    }
}
