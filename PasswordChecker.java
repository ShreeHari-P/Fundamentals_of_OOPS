import java.util.Scanner;

public class PasswordChecker {
    String password;

    public PasswordChecker(String password){
        this.password = password;
    }

    public boolean hasUpperCase(){
        return this.password.matches(".*[A-Z].*");
    }

    public boolean hasNumber(){
        return this.password.matches(".*[0-9].*");
    }

    public boolean isValid(){
        if(hasNumber() && hasUpperCase() && this.password.length() > 8){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = scan.nextLine();

        PasswordChecker p = new PasswordChecker(password);
        System.out.println("The Password has a uppercase: " + p.hasUpperCase());
        System.out.println("The Password has a digit: " + p.hasNumber());
        System.out.println("The Password is valid: " + p.isValid());
        scan.close();
    }
}
