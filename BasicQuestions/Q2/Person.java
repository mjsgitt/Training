public class Person{
    private String name;
    private double age;

    Person(String Name,double Age){
        this.name = Name;
        this.age = Age;
    }

    public String getName(){
        return this.name;
    }

    public double getAge(){
        return this.age;
    }
}