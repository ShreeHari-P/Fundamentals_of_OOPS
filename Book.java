import java.util.*;

class Read implements Comparable<Read>{
    private String title;
    private String author;
    private int pages;

    public Read(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    public int getPages(){return pages;}

    @Override
    public int compareTo(Read other){
        if(this.pages != other.pages){
            return Integer.compare(other.pages, this.pages);
        }
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString(){
        return "Book[title="+title+", author="+author+", pages="+pages+"]";
    }
}

public class Book {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        ArrayList<Read> read = new ArrayList<>();
        
        String[] parts1 = scan.nextLine().split(",");
        String[] parts2 = scan.nextLine().split(",");
        String[] parts3 = scan.nextLine().split(",");

        read.add(new Read(parts1[0], parts1[1], Integer.parseInt(parts1[2])));
        read.add(new Read(parts2[0], parts2[1], Integer.parseInt(parts2[2])));
        read.add(new Read(parts3[0], parts3[1], Integer.parseInt(parts3[2])));

        Collections.sort(read);

        for(Read myRead : read){
            System.out.println(myRead);
        }

    }    
}
