package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        salariedEmployee em1 = new salariedEmployee();
        em1.setsalary(12, 2);
        contracyEmployee em2 = new contracyEmployee();
        em2.setsalary(12, 12);
em1.setSocialSecurityNumber("12");


Employee[][] Workers = new Employee[2][];
        Workers[0]=new salariedEmployee[2];
        Workers[1]= new contracyEmployee[3];
        Workers[0][0] = em1;
        Workers[1][0] = em2;


        Workers[0][0].getSalary();
        Workers[0][0].setSocialSecurityNumber("123");
        System.out.println(Workers[0][0].getSocialSecurityNumber());
        Workers[1][0].setFederalTaxNumber("1223");
        System.out.println(Workers[1][0].getFederalTaxNumber());














    }
}
