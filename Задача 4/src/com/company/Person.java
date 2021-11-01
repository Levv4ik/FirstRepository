package com.company;
import java.util.Scanner;
public class Person {
    Scanner scr = new Scanner(System.in);
    private String name;
    private int birthYear ;
    public Person() {}
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    void infoInput(){
        System.out.println("Input some information about yourself: ");
        System.out.print("Name: ");
        name = scr.nextLine();
        System.out.print("Year of birth: ");
        birthYear = scr.nextInt();
    }
void infoOutput() {
    System.out.println("Information about user:");
    System.out.println("Name: "+ name);
    System.out.println("Year of birth: " + birthYear);
}
        void changeName(){
            System.out.println("New name: ");
            name = scr.nextLine();
            name = scr.nextLine();
            infoOutput();
    }

    void age(){
        int ag = 2021 - birthYear;
        System.out.println("Your age is: "+ ag);
    }


}
