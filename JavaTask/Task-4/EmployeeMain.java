import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) throws IOException {
        HashSet<String> idset = new HashSet<>();
        EmployeeMainMethods empmanage = new EmployeeMainMethods();
        empmanage.readIDsFromFile(idset);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Employee Management Application");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. For exit : ");
            System.out.print("Enter Your Choice : ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    empmanage.addEmployee(sc, idset);
                    break;
                case 2:
                    empmanage.displayEmployee(sc, idset);
                    break;
                case 3:
                    empmanage.updateEmployee(sc);
                    break;
                case 4:
                    empmanage.deleteEmployee(sc, idset);
                    break;
                case 5:
                    // write the IDs to the file before exiting
                    FileWriter idWriter = new FileWriter("employee_ids.txt");
                    for (String id : idset) {
                        idWriter.write(id + "\n");
                    }
                    idWriter.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice..");
            }
        }
    }
}
