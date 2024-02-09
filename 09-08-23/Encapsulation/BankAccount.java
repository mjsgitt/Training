// Challenge Create a bankaccount class and withdraw some money from the bank and printout the statement of remaining balance.
// This is an encapsulation method of writing the code.

// In encapsulation there are access modifiers which plays an important role in the class
// private , public , protect , default these are the modifers which are used in encapsulation method.

// Getter and setter methods are used to set values indirectly to the private variables which are there. through getter and setter we can access the private variables. 

public class BankAccount{
    private String owner;
    private double balance;

    BankAccount(String Owner,double MoneyDeposit){
        this.owner = Owner;
        this.balance = MoneyDeposit;
    }

    public void withdraw(double Moneywithdrawn){
            this.balance = balance - Moneywithdrawn;
    }
    public double GetBalace(){
        return balance;
    }
}