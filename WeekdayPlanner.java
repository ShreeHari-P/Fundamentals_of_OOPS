enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekend(){
        return this == SATURDAY || this == SUNDAY;
    }
}

public class WeekdayPlanner{
    public static void main(String[] args){

        for(Day day : Day.values()){

            if(day.isWeekend()){
                System.out.println(day + " -> Weekend");
            }else{
                System.out.println(day + " -> Working Day");
            }
        }
    }
}