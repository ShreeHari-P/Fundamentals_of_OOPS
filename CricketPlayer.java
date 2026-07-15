import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

class Player{
    private String name;
    private String team;
    private int runs;
    private double average;

    public Player(String name, String team, int runs, double average){
        this.name = name;
        this.team = team;
        this.runs = runs;
        this.average = average;
    }

    public String getName(){return name;}
    public String getTeam(){return team;}
    public int getRuns(){return runs;}
    public double getAverage(){return average;}

    @Override
    public String toString(){
        return "name=" + name + ", team=" + team + ", runs="+runs + ", avg="+average;
    }    
}

class RunsComparator implements Comparator<Player>{
    @Override
    public int compare(Player p1, Player p2){
        if(p1.getRuns() == p2.getRuns()){
            return Double.compare(p2.getAverage(), p1.getAverage());
        }
        return Integer.compare(p2.getRuns(), p1.getRuns());
    }
}

class AverageComparator implements Comparator<Player>{
    @Override
    public int compare(Player p1, Player p2){
        return Double.compare(p2.getAverage(), p1.getAverage());
    }
}

class NameComparator implements Comparator<Player>{
    @Override
    public int compare(Player p1, Player p2){
        return p1.getName().compareTo(p2.getName());
    }
}

public class CricketPlayer {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        ArrayList<Player> player = new ArrayList<>();

        while(scan.hasNextLine()){
            String line = scan.nextLine();
            if(line.trim().isEmpty()){
                break;
            }

            String[] parts = line.split(",");
            player.add(new Player(parts[0].trim(), parts[1].trim(), Integer.parseInt(parts[2].trim()), Double.parseDouble(parts[3].trim())));
        }

        System.out.println();
        System.out.println("Sorted by Runs:");
        Collections.sort(player, new RunsComparator());
        for(Player p : player){
            System.out.println(p);
        }

        System.out.println();
        System.out.println("Sorted by Average:");
        Collections.sort(player, new AverageComparator());
        for(Player p : player){
            System.out.println(p);
        }

        System.out.println();
        System.out.println("Sorted by Name:");
        Collections.sort(player, new NameComparator());
        for(Player p : player){
            System.out.println(p);
        }
    }
}
