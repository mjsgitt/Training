public class Main {
    public static void main(String[] args) {
        HourlyEmployee Emp1 = new HourlyEmployee(25000,"Putin", 48, 42, 5);
        System.out.println( "The Employer " + Emp1.getName() + " is set to be paid : $"  +  Emp1.ToPay() + " at the age of : "+ Emp1.getAge());
        HourlyEmployee Emp2 = new HourlyEmployee(25000,"Hitler", 28, 35, 6);
        System.out.println( "The Employer " + Emp2.getName() + " is set to be paid : $"  +  Emp2.ToPay() + " at the age of : "+ Emp2.getAge());
        HourlyEmployee Emp3 = new HourlyEmployee(25000,"Netanyahu", 32, 42, 105);
        System.out.println( "The Employer " + Emp3.getName() + " is set to be paid : $"  +  Emp3.ToPay() + " at the age of : "+ Emp3.getAge());
    }
}
