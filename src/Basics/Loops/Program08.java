package Basics.Loops;

import java.util.Scanner;

public class Program08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean found = false;
        int n = sc.nextInt();
        int sq = n * n;
        String sqStr = Integer.toString(sq);

        for(int i=1; i<sqStr.length(); i++){
            String leftStr = sqStr.substring(0,i);
            String rightStr = sqStr.substring(i);
            int left = Integer.parseInt(leftStr);
            int right = Integer.parseInt(rightStr);

            if(right!= 0 && left+right == n){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
