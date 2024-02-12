public class HourlyEmployee extends Employee {
    private double workTime;
    private double taskDone;

    HourlyEmployee(double Salary, String Name, double Age,double WorkTime,double TaskDone) {
        super(Salary, Name, Age);
        this.workTime = WorkTime;
        this.taskDone = TaskDone;        
    }

    @Override
    public double ToPay(){
        return (workTime * taskDone);
    }
    
}
