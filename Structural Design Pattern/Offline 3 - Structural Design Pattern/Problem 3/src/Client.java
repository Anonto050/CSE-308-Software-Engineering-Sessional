import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    public static List<Employee_component> employees;
    public static List<String> projects;
    public static List<SweCompany_composite> companies;
    public static List<Developer_leaf> developers;
    public static List<ProductManager_composite> managers;

    //class to check if the name is present in employees list
    public static boolean isEmployeePresent(String name) {
        for (Employee_component employee : employees) {
            if (employee.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    //class to check if the name is present in developers list
    public static boolean isDeveloperPresent(String name) {
        for (Developer_leaf developer : developers) {
            if (developer.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    //class to check if the name is present in managers list
    public static boolean isManagerPresent(String name) {
        for (ProductManager_composite manager : managers) {
            if (manager.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    //class to check if the name is present in projects list
    public static boolean isProjectPresent(String name) {
        for (String project : projects) {
            if (project.equals(name)) {
                return true;
            }
        }
        return false;
    }

    //class to check if the name is present in companies list

    public static boolean isCompanyPresent(String name) {
        for (SweCompany_composite company : companies) {
            if (company.name.equals(name)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        employees = new ArrayList<Employee_component>();
        projects = new ArrayList<String>();
        companies = new ArrayList<SweCompany_composite>();
        developers = new ArrayList<Developer_leaf>();
        managers = new ArrayList<ProductManager_composite>();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Add a company");
            System.out.println("2. Add a project");
            System.out.println("3. Add a manager");
            System.out.println("4. Add an developer");
            System.out.println("5. Remove a company");
            System.out.println("6. Remove a project");
            System.out.println("7. Remove a manager");
            System.out.println("8. Remove an developer");
            System.out.println("9. Show hierarchy");
            System.out.println("10. Show details");
            System.out.println("11. Exit");

            int choice = sc.nextInt();

            //initialize temporary manager and company
            ProductManager_composite pmanager = null;
            SweCompany_composite scompany = null;

            switch (choice) {
                case 1:
                    //Add a company
                    System.out.println("Enter company name: ");
                    String companyName = sc.next();
                    if (isCompanyPresent(companyName)) {
                        System.out.println("Company already exists");
                    } else {
                        SweCompany_composite company = new SweCompany_composite(companyName);
                        companies.add(company);
                    }
                    break;
                case 2:
                    //Add a project
                    //first create a company if it doesn't exist
                    System.out.println("Enter company name: ");
                    companyName = sc.nextLine();
                    companyName = sc.nextLine();
                    if (!isCompanyPresent(companyName)) {
                        System.out.println("Company doesn't exist. Creating a new company");
                        SweCompany_composite company = new SweCompany_composite(companyName);
                        companies.add(company);
                    }
                    //add project to the company
                    System.out.println("Enter project name: ");
                    String projectName = sc.next();
                    if (isProjectPresent(projectName)) {
                        System.out.println("Project already exists");
                    } else {
                        for (SweCompany_composite company : companies) {
                            if (company.name.equals(companyName)) {
                                company.addProject(projectName);
                                projects.add(projectName);
                            }
                        }
                    }
                    break;
                case 3:
                    //Add a manager
                    //first take company name and project name
                    System.out.println("Enter company name: ");
                    companyName = sc.next();
                    if (!isCompanyPresent(companyName)) {
                        System.out.println("Company doesn't exist. Creating a new company");
                        SweCompany_composite company = new SweCompany_composite(companyName);
                        scompany = company;
                        companies.add(company);
                    }
                    System.out.println("Enter project name: ");
                    projectName = sc.next();
                    if (!isProjectPresent(projectName)) {
                        System.out.println("Project doesn't exist. Creating a new project");
                        scompany.addProject(projectName);
                        projects.add(projectName);
                    }
                    //add manager to the project
                    System.out.println("Enter manager name: ");
                    String managerName = sc.next();
                    if (isEmployeePresent(managerName)) {
                        System.out.println("Employee already exists");
                    } else {
                        String managerRole = "Product Manager";
                        ProductManager_composite mng = new ProductManager_composite(managerName, managerRole, projectName);
                        scompany.addManager(mng);
                        employees.add(mng);
                        managers.add(mng);
                    }
                    break;
                case 4:
                    //Add an developer
                    //first take company name and project name
                    System.out.println("Enter company name: ");
                    companyName = sc.next();

                    if (!isCompanyPresent(companyName)) {
                        System.out.println("Company doesn't exist. Creating a new company");
                        SweCompany_composite company = new SweCompany_composite(companyName);
                        scompany = company;
                        companies.add(company);
                    }

                    System.out.println("Enter project name: ");
                    projectName = sc.next();
                    if (!isProjectPresent(projectName)) {
                        System.out.println("Project doesn't exist. Creating a new project");
                        scompany.addProject(projectName);
                        projects.add(projectName);
                    }
                    //add product manager
                    System.out.println("Enter manager name: ");
                    managerName = sc.next();
                    if (!isEmployeePresent(managerName)) {
                        System.out.println("Manager doesn't exist. Creating a new manager");
                        String managerRole = "Product Manager";
                        ProductManager_composite mng = new ProductManager_composite(managerName, managerRole, projectName);
                        scompany.addManager(mng);
                        employees.add(mng);
                        managers.add(mng);
                        pmanager = mng;
                    }
                    //add developer to the project
                    System.out.println("Enter developer name: ");
                    String developerName = sc.next();

                    if (isEmployeePresent(developerName)) {
                        System.out.println("Employee already exists");
                    } else {
                        String developerRole = "Developer";
                        Developer_leaf dev = new Developer_leaf(developerName, developerRole, projectName, pmanager);
                        pmanager.addEmployee(dev);
                        employees.add(dev);
                        developers.add(dev);
                    }

                    break;
                case 5:
                    //Remove a company
                    System.out.println("Enter company name: ");
                    String removeCompanyName = sc.next();
                    if (isCompanyPresent(removeCompanyName)) {
                        for (SweCompany_composite company : companies) {
                            if (company.getName().equals(removeCompanyName)) {
                                company.removeCompany();
                                companies.remove(company);
                            }
                        }
                    } else {
                        System.out.println("Company does not exist");
                    }
                    break;
                case 6:
                    //Remove a project
                    System.out.println("Enter project name: ");
                    String removeProjectName = sc.next();
                    if (isProjectPresent(removeProjectName)) {
                        for (SweCompany_composite company : companies) {
                            //check if the project is present in the company
                            if (company.getProjects().contains(removeProjectName)) {
                                company.removeProject(removeProjectName);
                                projects.remove(removeProjectName);
                            }
                        }
                    } else {
                        System.out.println("Project does not exist");
                    }
                    break;
                case 7:
                    //Remove a manager
                    System.out.println("Enter manager name: ");
                    String removeManagerName = sc.next();
                    if (isEmployeePresent(removeManagerName)) {
                        //find company of the manager
                        for(ProductManager_composite manager : managers){
                            if(manager.getName().equals(removeManagerName)){
                                pmanager = manager;
                            }
                        }
                        for (SweCompany_composite company : companies) {
                            //check if the project is present in the company
                            if (company.getManagers().contains(pmanager)) {
                                company.removeManager(pmanager);
                                employees.remove(pmanager);
                                managers.remove(pmanager);
                            }
                        }
                    }
                    else{
                            System.out.println("Employee does not exist");
                        }
                        break;
                    case 8:
                            //Remove an developer
                            System.out.println("Enter developer name: ");
                            String removeDeveloperName = sc.next();
                            if (isEmployeePresent(removeDeveloperName)) {
                               for(Developer_leaf dev: developers){
                                   if(dev.getName().equals(removeDeveloperName)){
                                       dev.getManager().removeEmployee(dev);
                                       employees.remove(dev);
                                       developers.remove(dev);
                                       dev = null;
                                   }
                               }
                            } else {
                                System.out.println("Employee does not exist");
                            }
                            break;
                       case 9:
                            //Show hierarchy

                           //take input asking for whom to show the hierarchy
                            System.out.println("1. Company");
                            System.out.println("2. Product Manager");

                            choice = sc.nextInt();
                            switch(choice){
                                case 1:
                                    //show company hierarchy
                                    System.out.println("Enter company name: ");
                                    String showCompanyName = sc.next();
                                    if(isCompanyPresent(showCompanyName)){
                                        for(SweCompany_composite company: companies){
                                            if(company.getName().equals(showCompanyName)){
                                                company.showHierarchy();
                                            }
                                        }
                                    }
                                    else{
                                        System.out.println("Company does not exist");
                                    }
                                    break;
                                case 2:
                                    //show manager hierarchy
                                    System.out.println("Enter manager name: ");
                                    String showManagerName = sc.next();
                                    if(isEmployeePresent(showManagerName)){
                                        for(ProductManager_composite manager: managers){
                                            if(manager.getName().equals(showManagerName)){
                                                manager.showHierarchy();
                                            }
                                        }
                                    }
                                    else{
                                        System.out.println("Employee does not exist");
                                    }
                                    break;
                            }

                            break;
                        case 10:
                            //take input asking for whom
                            System.out.println("Enter employee name: ");
                            String employeeName = sc.next();

                            if(isDeveloperPresent(employeeName)){
                                for(Developer_leaf dev: developers){
                                    if(dev.getName().equals(employeeName)){
                                        dev.showDetails();
                                    }
                                }
                            }
                            else if(isManagerPresent(employeeName)){
                                for(ProductManager_composite manager: managers){
                                    if(manager.getName().equals(employeeName)){
                                        manager.showDetails();
                                    }
                                }
                            }
                            else{
                                System.out.println("Employee does not exist");
                            }
                            break;
                        case 11:
                            //Exit
                            System.exit(0);
                            break;
                    }
            }
        }
}
