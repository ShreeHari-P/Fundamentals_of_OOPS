import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Player implements Comparable<Player>{
    private String name;
    private int runs;
    private int matches;

    public Player(String name, int runs, int matches){
        this.name = name;
        this.runs = runs;
        this.matches = matches;
    }

    public String getName(){return name;}
    public int getRuns(){return runs;}
    public int getMatches(){return matches;}

    @Override
    public int compareTo(Player other){
        if(this.runs != other.runs){
            return Integer.compare(other.runs, this.runs);
        }
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString(){
        return "Player[name=" + name +", runs=" + runs +", matches="+matches+"]";
    }
}

public class Cricket {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Player> player = new ArrayList<>();

        while(scan.hasNextLine()){
            String line = scan.nextLine();

            if(line.trim().isEmpty()){
                break;
            }

            String[] parts = line.split(",");
            player.add(new Player(parts[0].trim(), Integer.parseInt(parts[1].trim()), Integer.parseInt(parts[2].trim())));
        }

        Collections.sort(player);

        for(Player myPlayer : player){
            System.out.println(myPlayer);
        }
        scan.close();
    }
}
