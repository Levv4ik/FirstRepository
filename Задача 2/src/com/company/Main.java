package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner cs = new Scanner(System.in);
        System.out.print("Enter num: ");
    int num = cs.nextInt();

    String newStr = Integer.toString(num*num);
        System.out.println("Num ^ 2: "+newStr);

        if(Integer.toString(num*num).contains("3")) {
            System.out.print("Nums contains 3\n");
        }
        else System.out.print("Num doesn't contain 3\n");

    char[]arr = newStr.toCharArray();
    System.out.print("Reverse: ");
    for(int i = arr.length-1; i>= 0;i--) {
        System.out.print(arr[i]);
    }
        System.out.println();

        System.out.print("First and last number replaced with each other: ");
    int last = newStr.length()-1;
System.out.print(arr[last]);
for(int i = 1;i<arr.length-1;i++){System.out.print(arr[i]);}
System.out.print(arr[0]);

        System.out.println();
        System.out.print("Add 1 one the begin and the end of num: ");
        System.out.print("1"+ newStr +"1");

    }

    }

