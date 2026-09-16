import java.util.*;
import java.io.*;

class FileSimulator{

    public static void openFile(String type) throws IOException{

        if("missing".equals(type)){
            throw new FileNotFoundException("File not found");
        }else if("access".equals(type)){
            throw new IOException("Access denied");
        }
    }
}


class FileAnalyzer{
    public static void analyzeSpecific(String type){
        
        try{
            FileSimulator.openFile(type);
        }catch(FileNotFoundException e){
            System.out.println("Specific Catch: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Specific Catch: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }
    }

    public static void analyzeParent(String type){

        try{
            FileSimulator.openFile(type);
        }catch(Exception e){
            System.out.println("Parent Catch: Exception");
            System.out.println("Actual Type: " + e.getClass().getSimpleName());
        }
    }
}

public class FileExceptionHierarchy{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String fileType = scan.nextLine().toLowerCase();

        System.out.println("=== Specific Catch ===");
        FileAnalyzer.analyzeSpecific(fileType);
        System.out.println();

        System.out.println("=== Parent Catch ===");
        FileAnalyzer.analyzeParent(fileType);
        scan.close();
    }
}