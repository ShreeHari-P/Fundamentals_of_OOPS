import java.util.*;

interface ReceiptFormatter{
    String format();
}

class BankAccount{
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder(){return accountHolder;}
    public double getBalance(){return balance;}
    public void setBalance(double balance){this.balance = balance;}

    class Transaction{
        private double amount;
        private String transactionType;

        public Transaction(double amount, String transactionType){
            this.amount = amount;
            this.transactionType = transactionType;
        }

        public double getAmount(){return amount;}
        public String getTransactionType(){return transactionType;}
    }

    public String processTransaction(Transaction t){
        class BalanceChecker{   
            public boolean canWithdraw() {
                return balance >= t.getAmount();
            }
        }

        BalanceChecker checker = new BalanceChecker();

        boolean success = false;

        if (checker.canWithdraw()) {
            balance -= t.getAmount();
            success = true;
        }

        final boolean transactionSuccessful = success;

        ReceiptFormatter receipt = new ReceiptFormatter(){
            @Override
            public String format(){
                if (!transactionSuccessful) {
                    return "Insufficient Balance";
                }

                return "--- Transaction Receipt ---\n" +
                        "Account Holder: " + accountHolder + "\n" +
                        "Transaction: " + t.getTransactionType() + "\n" +
                        "Amount: " + t.getAmount() + "\n" +
                        "Remaining Balance: " + balance;
            }
        };
        return receipt.format();
    }
}

public class BankAccountSystem{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String accountHolder = scan.nextLine();
        double balance = scan.nextDouble();
        double amount = scan.nextDouble();
        scan.nextLine();
        String transactionType = scan.nextLine();
        
        BankAccount bank = new BankAccount(accountHolder, balance);
        BankAccount.Transaction transaction = bank.new Transaction(amount, transactionType);

        System.out.println(bank.processTransaction(transaction));
        scan.close();
    }
}