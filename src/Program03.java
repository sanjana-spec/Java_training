import java.util.Scanner;

public class Program03 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 2 digit number:");
        i = sc.nextInt();
        int a, b;
        a = i / 10;
        b = i % 10;
        System.out.println(a + b);
    }
}
