import java.util.*;

interface ReportFormatter{
    String format();
}
class StudentReport {
    private String studentName;

    public StudentReport(String studentName){
        this.studentName = studentName;
    }

    class MarkReport{
        private int score;

        public MarkReport(int score){
            this.score = score;
        }

        public int displayMark(){return score;}
    }

    public String generateReport(MarkReport mark){
        class GradeCalculator{
            public String calculate(int score){
                if(score >= 90){
                    return "A";
                }else if(score >= 75){
                    return "B";
                }else if(score >= 50){
                    return "C";
                }else {
                    return "F";
                }
            }
        }

        GradeCalculator gc = new GradeCalculator();
        String grade = gc.calculate(mark.displayMark());

        ReportFormatter formatter = new ReportFormatter() {
            @Override
            public String format(){
                return "---Report---\n" + 
                        "Student: " + studentName + "\n" + 
                        "Score: " + mark.displayMark() + "\n" +
                        "Grade: " + grade;
            }
        };
        return formatter.format();        
    }
}

public class StudentReportGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String studentName = sc.nextLine();
        int score = sc.nextInt();

        StudentReport student = new StudentReport(studentName);

        StudentReport.MarkReport mark =
                student.new MarkReport(score);

        System.out.println(student.generateReport(mark));

        sc.close();
    }
}
