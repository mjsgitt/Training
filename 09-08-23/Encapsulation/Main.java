public class Main {
    public static void main(String[] args) {
        BankAccount Acc1 = new BankAccount("Sudhkar",25000);
        Acc1.withdraw(15000);
        System.out.println("Your Available Balance : "+ Acc1.GetBalace());

        BankAccount Acc2 = new BankAccount("Amjad",180000);
        Acc2.withdraw(50000);

        Acc2.withdraw(50);
        
        System.out.println("Your Available Balance : "+ Acc2.GetBalace());
    }
}