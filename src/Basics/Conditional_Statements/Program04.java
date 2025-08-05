package Basics.Conditional_Statements;

import java.util.Scanner;

public class Program04 {
    public static void main(String[] args) {
        float a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the stock price from a month ago:");
        a = sc.nextFloat();
        System.out.println("Enter the current stock price:");
        b = sc.nextFloat();
        // float change = ( (a - b) / b ) * 100 and check if change > 10 etc....
        if(b > 0.1 * a){
            System.out.println("Buy");
        } else if (b > 0.05 * a || b < 0.1* a) {
            System.out.println("Hold");
        }
        else{
            System.out.println("Sell");
        }
    }
}
