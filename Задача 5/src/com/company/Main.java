package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
	float[] nums = new float[3];
    System.out.println("Enter 3 float numbers:" );
    for(int x = 0;x<nums.length;++x){
        System.out.print("Float " + (x+1) + " = ");
        nums[x] = scr.nextFloat();
    }
    for(int y = 0 ;y<nums.length; y++){
        if (nums[y] > -5 && nums[y] < 5) {
            System.out.println("Float " + (y+1) + " belongs to the range [-5,5]");
        }
        else System.out.println("Float " + (y+1) + " doesn't belong to the range [-5,5]");
    }

    }
}
