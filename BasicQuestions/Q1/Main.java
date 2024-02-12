package Q1;

public class Main{

    public static void main(String[] args) {
        Car car1 = new Car(2010, "Indica", 200000);
        System.out.println(" we got an old " + car1.getName() + " it's price is $" + car1.getPrice() + " it is from the year of :" +car1.getYear());
    }
}