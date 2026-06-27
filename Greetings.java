import java.util.Scanner;

@FunctionalInterface
interface Greeting{
    String greet(String name);
}

class TextProcessor{
    Greeting greeting;

    public TextProcessor(Greeting greeting){
        this.greeting = greeting;
    }

    public String process(String text){
        return greeting.greet(text);    
    }
}

public class Greetings {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String operation = scan.nextLine();

        TextProcessor processor;

        switch(operation){
            case "hello":
                processor = new TextProcessor(txt -> "Hello " + name);
                break;

            case "welcome":
                processor = new TextProcessor(txt -> "Welcome " + name);
                break;

            default:
                processor = new TextProcessor(txt -> txt);
        }

        String result = processor.process(name);
        System.out.println("Result: " + result);

    }    
}
