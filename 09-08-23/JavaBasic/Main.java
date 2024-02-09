public class Main{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Hemanth", 22, 25000,"Bangolre" );
        Employee emp2 = new Employee("Varun", 26, 50000, "Mumbai");
        emp1.RiseSalary();
        System.out.println(emp1.salary);
        System.out.println(emp2.salary);
    }
}