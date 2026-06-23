interface BankAccount{
    void deposit(double amount);

    default void transaction(double amount){
        System.out.println("Transaction Started");
        deposit(amount);
    }

    static double bonus(double amount){
        return amount + 500;
    }
}

class SavingsAccount implements BankAccount{
    @Override
    public void deposit(double amount){
        System.out.println("Savings deposit: " + amount);
    }
}

class PriorityTransaction implements BankAccount{
    @Override
    public void deposit(double amount){
        System.out.println("Current deposit: " + amount);
    }

    @Override
    public void transaction(double amount){
        System.out.println("Priority transaction");
        deposit(amount);
    }
}

public class BankSystem {
    public static void main(String[] args){

        double amount = BankAccount.bonus(5000);
        BankAccount savings = new SavingsAccount();
        BankAccount priority = new PriorityTransaction();

        savings.transaction(amount);
        System.out.println();
        priority.transaction(amount);
    }   
}
