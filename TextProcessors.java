import java.util.Scanner;

@FunctionalInterface
interface TextOperation{
    String apply(String text);
}

class TextProcessor {
    TextOperation op;
    
    public TextProcessor(TextOperation op){
        this.op = op;
    }

    public String process(String text){
        return op.apply(text);
    }
}

public class TextProcessors{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Text: ");
        String str = scan.nextLine();

        TextProcessor upper = new TextProcessor(txt -> txt.toUpperCase());
        TextProcessor lower = new TextProcessor(txt -> txt.toLowerCase());
        TextProcessor reverse = new TextProcessor(txt -> new StringBuilder(txt).reverse().toString());
        TextProcessor removeSpace = new TextProcessor(txt -> txt.replaceAll("\\s+",""));
        TextProcessor count = new TextProcessor(txt -> String.valueOf(txt.length()));

        System.out.println("Uppercase: " + upper.process(str));       
        System.out.println("Lowercase: " + lower.process(str));       
        System.out.println("Reverse: " + reverse.process(str));      
        System.out.println("Remove space: " + removeSpace.process(str));      
        System.out.println("Count: " + count.process(str)); 
        scan.close();
    }
}
