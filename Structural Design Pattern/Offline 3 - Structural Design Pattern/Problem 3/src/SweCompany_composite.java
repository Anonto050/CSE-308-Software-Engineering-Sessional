import java.util.ArrayList;
import java.util.List;

public class SweCompany_composite implements Component{
    String name;
    int projectCount;
    List<String> projects;
    List<Employee_component> managers;

    public SweCompany_composite(String name) {
        this.name = name;
        this.projectCount = 0;
        this.projects = new ArrayList<String>();
        this.managers = new ArrayList<Employee_component>();
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        //
    }

    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return null;
    }

    @Override
    public String getProjectName() {
        return null;
    }

    public void addManager(Employee_component manager) {
        managers.add(manager);
    }

    public List<Employee_component> getManagers() {
        return managers;
    }

    public List<String> getProjects() {
        return projects;
    }

    public int getProjectCount() {
        return projectCount;
    }

    public void removeManager(Employee_component manager) {
        //Remove all employees under him first and then remove the manager
        if(manager instanceof ProductManager_composite) {
            ProductManager_composite pm = (ProductManager_composite) manager;
            for(Employee_component employee: pm.employees) {
                pm.removeEmployee(employee);
            }
        }
        managers.remove(manager);
    }

    public void addProject(String project) {
        projects.add(project);
        projectCount++;
    }

    public void removeProject(String project) {
        //Remove all manager under this project first and then remove the project
        for(Employee_component manager: managers) {
            if(manager.getProjectName().equals(project)) {
                removeManager(manager);
            }
        }
    }

    public void removeCompany() {
        //Remove all managers and projects
        for(String project: projects) {
            removeProject(project);
        }
    }

    public void showHierarchy() {
        System.out.println("- " + name);
        //show all projects under this company
        for(String project: projects) {
            //System.out.println("  - " + project);
            //show all managers under this project
            for(Employee_component manager: managers) {
                if(manager.getProjectName().equals(project)) {
                    System.out.println("   - " + manager.getName() + " (" + project + ")");
                    //show all employees under this manager
                    if(manager instanceof ProductManager_composite) {
                        ProductManager_composite pm = (ProductManager_composite) manager;
                        for(Employee_component employee: pm.employees) {
                            System.out.println("     - " + employee.getName());
                        }
                    }
                }
            }
        }
    }
}
