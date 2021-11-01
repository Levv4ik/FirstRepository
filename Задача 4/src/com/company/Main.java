package com.company;
import java.lang.reflect.Field;


public class Main {

    public static void main(String[] args){
	// write your code
        Person man = new Person("Ivan",2000);
man.infoInput();
man.infoOutput();
man.changeName();
man.age();
    }
}
