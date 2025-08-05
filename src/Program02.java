import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {
        int l, b;
        System.out.println("Enter the length and breadth :");
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        b = sc.nextInt();
        int perimeter = 2 * (l + b);
        System.out.println("Length of the rope:" + perimeter);
        int area = l * b;
        System.out.println("Quantity of the carpet:" + area);
    }
}
