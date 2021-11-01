package com.company;

public class Main {

    public static void main(String[] args) {
Dog newdog1 = new Dog("Leksa",breed.Boxer,12 );
newdog1.info();
Dog newdog2 = new Dog("Leksa",breed.Poodle,14);
        newdog2.info();
        Dog newdog3 = new Dog("sashka",breed.Poodle,15);
        Dog newdog4 = new Dog("Nika",breed.French_Bulldog,6);
        newdog1.equals(newdog2);
        newdog3.oldest(newdog1,newdog2,newdog4);



    }
}
