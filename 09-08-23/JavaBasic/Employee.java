public class Employee{
    String name;
    int age;
    double salary;
    String location;

    Employee(String Name,int Age,double Salary,String Location){
        this.name = Name;
        this.age = Age;
        this.salary = Salary;
        this.location = Location;
    }

    public void RiseSalary(){
        this.salary =salary + (salary * 20)/100;
    }
    
}