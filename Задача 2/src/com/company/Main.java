package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Type number:");
        int n = scan.nextInt();
        int n2 =n* n;
        System.out.println("n^2 = " + n2);
        if(n2 < 100) {
            int n4 = n2 / 10;
            int n5 = n2 % 10;
            System.out.print("Reverse = " + n5);
            System.out.println(n4);
            System.out.print("1 in the start and end: " + "1" + n4);
            System.out.println(n5+ "1");
            if (n4 == 3 || n5 == 3) {
                System.out.println("There is 3 in the number");

            } else {
                System.out.println("There is no 3 in the number");
            }
        }
            else if(n2 < 1000&& n2 >100){
                int n8 = n2 / 100;
                int n9 = n2 % 100;
                int n6 = n9 / 10;
                int n7 = n9 % 10;
            System.out.print("Reverse = " + n7);
            System.out.print(n6);
            System.out.println(n8);
            System.out.print("1 in the start and end: " + "1" + n8);
            System.out.print(n6);
            System.out.println(n7+ "1");
                if(n8==3||n6==3||n7==3) {
                    System.out.println("There is 3 in the number");

                }
                else{
                    System.out.println("There is no 3 in the number");
                }
                }
            else{
            System.out.println("Number is too long");
        }

        }
            }



