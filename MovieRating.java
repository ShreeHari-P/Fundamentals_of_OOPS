import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

class Movie{
    public String title;
    public String genre;
    public double rating;

    public Movie(String title, String genre, double rating){
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle(){return title;}
    public String getGenre(){return genre;}
    public double getRating(){return rating;}

    @Override
    public String toString(){
        return title + " - " + rating;
    }
}

class RatingComparator implements Comparator<Movie>{
    @Override
    public int compare(Movie m1, Movie m2){
        if(m1.getRating().equals(m2.getRating())){
            return m1.getTitle().compareTo(m2.getTitle());
        }else{
            return Double.compare(m2.getRating(), m1.getRating());
        }
    }
}

class TitleComparator implements Comparator<Movie>{
    @Override
    public int compare(Movie m1, Movie m2){
        return m1.getTitle().compareTo(m2.getTitle());
    }
}

public class MovieRating {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String line1 = scan.nextLine();
        String line2 = scan.nextLine();
        String line3 = scan.nextLine();
        String line4 = scan.nextLine();

        String[] parts1 = line1.split(",");
        String[] parts2 = line2.split(",");
        String[] parts3 = line3.split(",");
        String[] parts4 = line4.split(",");

        ArrayList<Movie> movie = new ArrayList<>();

        movie.add(new Movie(parts1[0], parts1[1], Double.parseDouble(parts1[2])));
        movie.add(new Movie(parts2[0], parts2[1], Double.parseDouble(parts2[2])));
        movie.add(new Movie(parts3[0], parts3[1], Double.parseDouble(parts3[2])));
        movie.add(new Movie(parts4[0], parts4[1], Double.parseDouble(parts4[2])));

        Collections.sort(movie, new RatingComparator());
        for(Movie m : movie){
            System.out.println(m);
        }

        System.out.println();
        Collections.sort(movie, new TitleComparator());
        for(Movie m : movie){
            System.out.println(m);
        }
    }
}
