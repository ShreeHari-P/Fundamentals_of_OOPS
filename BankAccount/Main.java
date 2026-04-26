public class Main{
    public static void main(String[] args){
        
        BankAccounts bank = new BankAccounts("Arthi");

        System.out.println("Account Holder: " + bank.accountHolder);
        bank.deposit(500);
        bank.withdraw(400);
        System.out.println("Available Balance ₹" + bank.getBalance());
    }
}