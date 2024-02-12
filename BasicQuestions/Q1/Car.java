package Q1;

public class Car {
    private double year;
    private String name;
    private double price;

    Car(double Year,String Name, double Price){
        this.year  = Year;
        this.name = Name;
        this.price = Price;
    }

    public double getYear(){
        return this.year;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}