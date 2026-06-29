import java.awt.RadialGradientPaint;
import java.util.*;

@FunctionalInterface
interface OTPGenerate{
    String generate();
}

public class OTPGenerator {
    public static void main(String[] args) {
        
        Random rand = new Random();

        OTPGenerate otp4 = () -> {
            StringBuilder otp = new StringBuilder();
            for(int i = 0; i < 4; i++){
                otp.append(rand.nextInt(10));
            }
            return String.valueOf(otp);
        };

        OTPGenerate otp6 = () -> {
            StringBuilder otp = new StringBuilder();
            for(int i = 0; i < 6; i++){
                otp.append(rand.nextInt(10));
            }
            return String.valueOf(otp);
        };

        OTPGenerate otp8 = () -> {
            StringBuilder otp = new StringBuilder();
            for(int i = 0; i < 8; i++){
                otp.append(rand.nextInt(10));
            }
            return String.valueOf(otp);
        };

        System.out.println("4 Digit OTP: " + otp4.generate());
        System.out.println("6 Digit OTP: " + otp6.generate());
        System.out.println("8 Digit OTP: " + otp8.generate());
    }
}
