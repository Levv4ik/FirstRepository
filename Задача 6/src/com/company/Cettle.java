package com.company;

public class Cettle {
    private String name;
    private int watterCapacity;
   private int capacity;
   private int boilTime;
   private boolean plugIn;
   private boolean isClosed;

   public void setWatterCapacity(int setWatterCapacity){
      watterCapacity = setWatterCapacity;
   }
   public int getWatterCapacity(){
       return watterCapacity;
   }
   public void setPlugIn(boolean setPlugIn){
       plugIn = setPlugIn;
   }
   public boolean getPlugIn(){
       return plugIn;
   }
    public void setIsClosed(boolean setIsClosed){
        plugIn = setIsClosed;
    }
    public boolean getIsClosed(){
        return isClosed;
    }
    public void setName(String setName){
       setName=name;
    }
    @Override
    public String toString(){
       System.out.println(name);
       return name;
    }
   Cettle(){}
   Cettle(String name,boolean plugIn,boolean isClosed, int watterCapacity){
       this.plugIn = plugIn;
       this.watterCapacity=watterCapacity;
       this.isClosed=isClosed;
       this.name=name;
   }
    Cettle(String name,boolean plugIn,boolean isClosed){
        this.plugIn = plugIn;
        this.isClosed=isClosed;
        this.name=name;
    }
    Cettle(String name,boolean plugIn, int watterCapacity){
        this.plugIn = plugIn;
        this.watterCapacity=watterCapacity;
        this.name=name;
    }
@Override
public boolean equals(Object o) {
       Cettle cettle = (Cettle) o;
       if(name == cettle.name&&capacity == cettle.capacity){
           System.out.println("This are the same cettles");
       }
       else System.out.println("This are not the same cettles");
       return name == cettle.name&&capacity == cettle.capacity;
}
@Override

    public int hashCode() {
    int eq = capacity - watterCapacity;
    if (capacity == watterCapacity) {
        System.out.println("Cattle if full");
    }
    else System.out.println("Cettle is not full");
    return eq;
}
public  void turnon() throws InterruptedException {
       System.out.println(this.name+" started heating the water");
    Thread.sleep(2000);
    System.out.println("3");
    Thread.sleep(2000);
    System.out.println("2");
    Thread.sleep(2000);
    System.out.println("1");
    Thread.sleep(2000);
    System.out.println("Water is boiled");

}

}
