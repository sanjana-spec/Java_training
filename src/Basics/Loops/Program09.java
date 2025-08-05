package Basics.Loops;

import java.util.Scanner;

public class Program09 {
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int i;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();

        while (i != 0) {
            int temp = i % 10;
            if (!isPrime(temp)) {
                sum += temp;
            }
            i = i / 10;
        }
        System.out.println(sum);
    }
}
