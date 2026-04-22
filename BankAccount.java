import java.util.Scanner;

public class BankAccount{
    private String accountHolder;
    private double balance;

    public BankAccount(){
        this.accountHolder = "Unknown";
        this.balance = 1000;
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            System.out.println("Amount Deposited Successfully. Balance is: " + this.balance);
        }else{
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient Balance");
        }else if(amount <= 0){
            System.out.println("Invalid withdrawal amount");
        }else{
            this.balance -= amount;
            System.out.println("Withdrawal Successfully, and the amount is " + this.balance);
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BankAccount b = new BankAccount();

        int choice;
        

        do{
            System.out.println("1. Deposit\n2. Withdraw\n3. Get Balance\n4. Exit");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Deposit Amount: ");
                    double dep = scan.nextDouble();
                    b.deposit(dep);
                    break;

                case 2:
                    System.out.println("Enter withdrawal Amount: ");
                    double wit = scan.nextDouble();
                    b.withdraw(wit);
                    break;
                
                case 3:
                    System.out.println("Available Balance: " + b.getBalance());
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        }while(choice <= 4);
    }
}