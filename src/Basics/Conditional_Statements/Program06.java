package Basics.Conditional_Statements;

import java.util.Scanner;

public class Program06 {
    public static void main(String[] args) {
        float n , v1, v2;
        float dist_e, dist_s, time_e, time_s;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the floor number:");
        n = sc.nextFloat();
        dist_e = (float) 2.0 * n;
        dist_s = (float) 1.414 * n;
        System.out.println("Enter the velocity of william:");
        v1 = sc.nextFloat();
        System.out.println("Enter the velocity of elevator:");
        v2 = sc.nextFloat();
        time_e = dist_e / v2;
        time_s = dist_s / v1;

        if(time_e < time_s){
            System.out.println("Elevator");
        }
        else{
            System.out.println("Stairs");
        }

    }

}
