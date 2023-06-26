import java.util.ArrayList;
import java.util.List;

public class ProductManager_composite implements Employee_component {
    String name;
    String role;
    String projectName;
    List<Employee_component> employees;

    public ProductManager_composite(String name, String role, String projectName) {
        this.name = name;
        this.role = role;
        this.projectName = projectName;
        this.employees = new ArrayList<Employee_component>();
    }

    public void addEmployee(Employee_component employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee_component employee) {
        employees.remove(employee);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getProjectName() {
        return projectName;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Current Project : " + projectName);
        System.out.println("Employees under this manager: "+employees.size());
    }

    public void showHierarchy() {
        System.out.println("- " + name + "(" +projectName+")");

        for(Employee_component employee: employees) {
            System.out.println("  - " + employee.getName());
        }
    }
}
