public class Laptop {
    double Ram;
    String Os;
    String name;

    public Laptop(double ram,String os, String Name){
        this.Ram = ram;
        this.Os = os;
        this.name = Name ;
    }

    public void RamExtended(double Extend){
        System.out.println("your " + name + " laptop can this be extended upto this (" + (Ram) + " + " + Extend + ") GB");
    }
}