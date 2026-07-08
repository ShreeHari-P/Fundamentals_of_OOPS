import java.util.*;

class MovieBuzz implements Comparable<MovieBuzz>{
    private String title;
    private String director;
    private double rating;

    public MovieBuzz(String title, String director, double rating){
        this.title = title;
        this.director = director;
        this.rating = rating;
    }

    public String getTitle(){return title;}
    public String getDirector(){return director;}
    public double getRating(){return rating;}

    @Override
    public int compareTo(MovieBuzz other){
        if(this.rating != other.rating){
            return Double.compare(other.rating, this.rating);
        }
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString(){
        return "Movie[title="+title+", director="+director+", rating="+rating+"]";
    }
}

public class Movie {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<MovieBuzz> movie = new ArrayList<>();

        while(true){
            String line = scan.nextLine();

            if(line.trim().isEmpty()){
                break;
            }

            String[] parts = line.split(",");
            movie.add(new MovieBuzz(parts[0].trim(), parts[1].trim(), Double.parseDouble(parts[2].trim())));
        }

        Collections.sort(movie);
        
        for(MovieBuzz myMovie : movie){
            System.out.println(myMovie);
        }
        scan.close();
    }
}
