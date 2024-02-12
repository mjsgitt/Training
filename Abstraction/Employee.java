public abstract class Employee{
    private double salary;
    private String name;
    private double age;

    Employee(double Salary,String Name,double Age){
        this.salary = Salary;
        this.name = Name;
        this.age = Age;
    }


    // this is an abstract method where it should be hidden and cannot be instantiated.
    public abstract double ToPay();

    public String getName(){
        return name;
    }
    public void setName(String Name){
        this.name = Name;
    }

    public double getAge(){
        return age;
    }

    public void setAge(double Age){
        this.age = Age;
    }
}