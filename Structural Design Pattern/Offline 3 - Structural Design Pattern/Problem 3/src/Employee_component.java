public interface Employee_component extends Component {
    public void showDetails();
    public String getName();
    public String getRole();
    public String getProjectName();
    public void setName(String name);
    public void setRole(String role);
    public void setProjectName(String projectName);
    public void showHierarchy();
    public void addEmployee(Employee_component employee);
    public void removeEmployee(Employee_component employee);
}
