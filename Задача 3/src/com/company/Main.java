package com.company;
import java.util.Scanner;
import java.lang.String;
public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    float p = 3.14f;
    System.out.print("Enter radius of flower bad: ");
    float r = scan.nextFloat();
    float s = p*(r*r);
    float c = 2*p*r;
        System.out.println("Area of flower bad: "+ s);
        System.out.println("Perimeter of flower bad: "+ c);

        System.out.println();

        System.out.print("What is your name?  ");
        String broblema = scan.nextLine();
        String name = scan.nextLine();
        System.out.print("Where do you live "+ name + "? ");
        String adress = scan.nextLine();
       System.out.println(name + " lives in "+adress );

        System.out.println();

     System.out.print("Call from first country continued(min): ");
     int firstCountry = scan.nextInt();
        System.out.print("Call from second country continued(min): ");
        int secondCountry = scan.nextInt();
         System.out.print("Call from third country continued(min): ");
         int thirdCountry = scan.nextInt();
         int t = firstCountry+secondCountry+thirdCountry;
        System.out.print("Talk together: "+ t+ " minutes");

    }
}
