package com.company;

 public  class Employee implements calculatePay {
    private int workersNumber = 0;
     public void setSocialSecurityNumber(String socialSecurityNumber){};
     public String getSocialSecurityNumber(){
         return "0";
     };
     public void setFederalTaxNumber(String federalTaxNumber) {}
     public String getFederalTaxNumber() {
         return "0";
     }
     @Override
     public int setsalary(int rate, int num) {
         return 0;
     }
     @Override
     public int getSalary() {
         return 0;
     }
 }
