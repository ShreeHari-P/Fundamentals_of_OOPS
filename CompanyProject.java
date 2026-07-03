import java.util.HashSet;
import java.util.Objects;

class Employee {
    private String employeeId;
    private String employeeName;
    private String department;

    public Employee(String employeeId, String employeeName, String department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

class Project {
    private String projectId;
    private String projectName;
    private Employee manager;
    private int budget;

    public Project(String projectId, String projectName, Employee manager, int budget) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.manager = manager;
        this.budget = budget;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Project project = (Project) obj;

        return Objects.equals(projectId, project.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId);
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId='" + projectId + '\'' +
                ", projectName='" + projectName + '\'' +
                ", manager='" + manager.getEmployeeName() + '\'' +
                ", budget=" + budget +
                '}';
    }
}

public class CompanyProject {
    public static void main(String[] args) {

        // Employees
        Employee e1 = new Employee("E101", "Shree", "Development");
        Employee e2 = new Employee("E102", "Sesu", "Testing");
        Employee e3 = new Employee("E103", "Arthi", "HR");

        // Projects
        Project p1 = new Project("P101", "Coffee App", e1, 100000);
        Project p2 = new Project("P101", "Real Estate System", e2, 500000);
        Project p3 = new Project("P103", "Farm Management", e3, 300000);

        HashSet<Project> projectSet = new HashSet<>();

        projectSet.add(p1);
        projectSet.add(p2); // Duplicate projectId, won't be added
        projectSet.add(p3);

        System.out.println("Total Unique Projects: " + projectSet.size());
        System.out.println();

        for (Project project : projectSet) {
            System.out.println(project);
        }
    }
}