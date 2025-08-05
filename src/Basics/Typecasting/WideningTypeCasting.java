package Basics.Typecasting;

public class WideningTypeCasting {
    public static void main(String[] args) {
        int a = 10;
        long b = a;
        float c = b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //narrowing typecasting
        double y = 120.222;
        long d = (long) y;
        System.out.println(y);
        System.out.println(d);
    }
}
