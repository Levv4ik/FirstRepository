package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	Cettle cettle1 = new Cettle("Philips",true,true,3);
    Cettle cettle2 = new Cettle("Philips",true,false);
        Cettle cettle3 = new Cettle("Philips",true,3);
        Cettle cettle4 = new Cettle("Philips",true,true,3);
        cettle1.toString();
        cettle1.equals(cettle4);
        cettle1.hashCode();
 cettle1.turnon();



    }
}
