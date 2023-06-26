public class Developer_leaf implements Employee_component {
    String name;
    String role;
    String projectName;
    ProductManager_composite manager;

    public Developer_leaf(String name, String role, String projectName, ProductManager_composite manager) {
        this.name = name;
        this.role = role;
        this.projectName = projectName;
        this.manager = manager;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Current Project : " + projectName);
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

    @Override
    public void showHierarchy() {

    }

    @Override
    public void addEmployee(Employee_component employee) {
        //Do nothing
    }

    @Override
    public void removeEmployee(Employee_component employee) {
       //Do nothing
    }

    public void setManager(ProductManager_composite manager) {
        this.manager = manager;
    }

    public ProductManager_composite getManager() {
        return manager;
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
}
