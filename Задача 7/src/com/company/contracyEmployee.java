package com.company;

public class contracyEmployee extends Employee implements calculatePay{
private int salary;
    private String FederalTaxNumber;
@Override
    public void setFederalTaxNumber(String federalTaxNumber) {
        FederalTaxNumber = federalTaxNumber;
    }
    @Override
    public String getFederalTaxNumber() {
        return FederalTaxNumber;
    }
    @Override
    public int setsalary(int hRate, int num) {
        System.out.println("Contracy employee salary is: "+ hRate*num);
       this.salary = hRate*num;
        return  salary;
    }
    public int getSalary(){
        System.out.println("Salaried employee salary is: "+salary);
        return salary;
    }
}
