public class BankAccounts {
    private double balance;
    public String accountHolder;

    public BankAccounts(String accHolder){
        this.balance = 1000;
        this.accountHolder = accHolder;
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            System.out.println("Amount Deposited Successfully");
        }else{
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance(){
        return balance;
    }
}
