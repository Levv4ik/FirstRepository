package com.company;

public class salariedEmployee extends Employee implements calculatePay {
private String socialSecurityNumber;
    private int salary;
@Override
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
@Override
    public String getSocialSecurityNumber() {
    System.out.println(socialSecurityNumber);
        return socialSecurityNumber;
    }
    @Override
    public int setsalary(int rate, int month) {
        System.out.println("Salaried employee salary is: "+ rate*month);
       this.salary =  rate*month;
        return salary;
    }
    @Override
    public int getSalary(){
        System.out.println("Salaried employee salary is: "+salary);
        return salary;
    }
}
