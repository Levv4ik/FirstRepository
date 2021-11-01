package com.company;

public class Dog   {
    private String name;
     private breed Breed;
    private int age ;
@Override
    public boolean equals(Object o) {
        Dog dog = (Dog) o;
        if(name == dog.name){
         System.out.println("Names are the same");
        }
        return name == dog.name;
    }
public void oldest(Object a, Object b, Object c){
    Dog dog = (Dog) a;
    Dog dog1 = (Dog) b;
    Dog dog2 = (Dog) c;
    if(age > dog.age&&age> dog1.age&&age> dog2.age){
        System.out.println(this.name +" dog is the oldest");
    }
    else if(dog.age>age&&dog.age>dog1.age&&dog.age>dog2.age){
        System.out.println( ((Dog) a).name +" is the oldest");
    }
    else if(dog1.age>age&&dog1.age>dog.age&&dog1.age>dog2.age){
        System.out.println( ((Dog) b).name +" is the oldest");
    }
    else if(dog2.age>age&&dog2.age>dog1.age&&dog2.age>dog.age){
        System.out.println( ((Dog) c).name +" is the oldest");
    }

}



    public Dog(){}
    public Dog(String name,breed breeed,int age){
    this.name = name;
    this.Breed = breeed;
    this.age = age;
    };
void setName(String name){
    this.name = name;
}
String getName(){
    return name;
}
void nameCompare(){

}


void info(){
    System.out.print("Name: "+name );
    System.out.print(" Breed: "+Breed );
    System.out.println(" Age: "+age );
    }






}
