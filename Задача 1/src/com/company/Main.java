package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner type = new Scanner(System.in);
        System.out.println("Type parameters of brick:");
        System.out.print("Side a:");
        int a = type.nextInt();
        System.out.print("Side b:");
        int b = type.nextInt();
        System.out.print("Side c:");
        int c = type.nextInt();
        System.out.println("Type parameters of hole:");
        System.out.print("Side x:");
        int x = type.nextInt();
        System.out.print("Side y:");
        int y = type.nextInt();
        boolean isTrue = true;
        isTrue = a<=x && b<=y || a<=y && b<=x || a<=x && c<=y || a<=y && c<=x|| b<=x && c<=y||b <=y && c<=x;
        if(isTrue) {
            System.out.println("Brick fits in the hole.");
        }
       else{
                System.out.println("Brick don't fit in the hole.");
        }
    }
}
