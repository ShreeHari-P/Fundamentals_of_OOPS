import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

class Athlete implements Comparable<Athlete>{
    private String country;
    private String athleteName;
    private int gold;
    private int silver;
    private int bronze;

    public Athlete(String country, String athleteName, int gold, int silver, int bronze){
        this.country = country;
        this.athleteName = athleteName;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }

    public String getCountry(){return country;}
    public String getAthleteName(){return athleteName;}
    public int getGold(){return gold;}
    public int getSilver(){return silver;}
    public int getBronze(){return bronze;}

    @Override
    public int compareTo(Athlete other){
        if(this.gold != other.gold){
            return Integer.compare(other.gold, this.gold);
        }

        if(this.silver != other.silver){
            return Integer.compare(other.silver, this.silver);
        }

        if(this.bronze != other.bronze){
            return Integer.compare(other.bronze, this.bronze);
        }

        return this.athleteName.compareTo(other.athleteName);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Athlete athlete = (Athlete) obj;
        return Objects.equals(athleteName, athlete.athleteName);
    }

    @Override
    public int hashCode(){
        return Objects.hash(athleteName);
    }

    @Override
    public String toString(){
        return "Olmpics[country="+country+", name="+athleteName+", gold="+gold+", silver="+silver+", bronze="+bronze+"]";
    }
}

class CountryComparator implements Comparator<Athlete>{
    @Override
    public int compare(Athlete a1, Athlete a2){
        return a1.getCountry().compareTo(a2.getCountry());
    }
}

class GoldComparator implements Comparator<Athlete>{
    @Override
    public int compare(Athlete a1, Athlete a2){
        return Integer.compare(a2.getGold(), a1.getGold());
    }
}

public class OlympicAthlete{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        ArrayList<Athlete> athlete = new ArrayList<>();

        System.out.println("Enter five inputs:");
        for(int i = 0; i < 5; i++){
            String line = scan.nextLine().trim();
            String[] parts = line.split(",");
            
            athlete.add(new Athlete(parts[0], parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3]), Integer.parseInt(parts[4])));
        }

        System.out.println();
        Collections.sort(athlete);
        for(Athlete a : athlete){
            System.out.println(a);
        }

        System.out.println();
        Collections.sort(athlete, new CountryComparator());
        for(Athlete a : athlete){
            System.out.println(a);
        }

        System.out.println();
        Collections.sort(athlete, new GoldComparator());
        for(Athlete a : athlete){
            System.out.println(a);
        }
    }
}