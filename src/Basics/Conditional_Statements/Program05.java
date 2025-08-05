package Basics.Conditional_Statements;

import java.util.Scanner;

public class Program05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int litres = sc.nextInt();
        double bill = 0.0;

        if(litres <= 100){
            bill = litres * 2.0;
        } else if (litres <= 500) {
            bill = 100 * 2.0 + (litres - 100) * 1.5;
        } else {
            bill = 100 * 2.0 + 400 * 1.5 + (litres - 500) * 1.0;
        }
        System.out.println(bill);
    }
}
