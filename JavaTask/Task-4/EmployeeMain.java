import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
class EmployeeManagement { 
    public void addEmployee(Scanner sc){
        System.out.print("Enter Employee id : ");
        int id = sc.nextInt(); 
        System.out.print("Enter Employee Age : ");
        int age  = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Employee Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Employee salary : ");
        Double salary = sc.nextDouble();
        System.out.println("Employee Added in list Sucessfully..");
        try {
        PrintWriter employee = new PrintWriter(new FileWriter("employee.txt", true));
        employee.write(id + " " + name + " " + age + " " + salary);
        employee.println();
        employee.close();
        System.out.println("Content is successfully Written on file..");
        } catch (IOException e) {
       System.out.println("An Error occurred " + e.getMessage());
    }
}
   public void deleteEmployee(Scanner sc) throws IOException {
        System.out.print("Enter id to delete :");
        String id = sc.nextLine();
        boolean employeeFound=false;
        File tempFile = new File("temp_employee.txt");
        File originalFile = new File("employee.txt");
        
        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
        BufferedReader br = new BufferedReader(new FileReader(originalFile));
        String line;
            try {
                while((line = br.readLine()) != null){
                    String[] data = line.split(" ");
                    String employeeId = data[0];
                    if(employeeId.equals(id)){
                        System.out.println("Id found");
                        employeeFound=true;
                        continue;
                    }
                    pw.write(line);
                    pw.println();
                }
    pw.close();
    br.close();
    if(originalFile.exists()){           
    originalFile.delete();
    System.out.println("original file deleted successfully");
    }
    tempFile.renameTo(originalFile);           
    if (employeeFound) {
    System.out.println("Employee data deleted successfully.");
    } else {
    System.out.println("Employee data not found.");
    }
    } catch (FileNotFoundException e) {
    System.out.println("File not Found..");
    }
}
   public void updateEmployee(Scanner sc) throws IOException {
    System.out.print("Enter id to Update :");
        String id = sc.nextLine();
        boolean employeeFound=false;
        File tempFile = new File("temp_employee.txt");
        File originalFile = new File("employee.txt");        
        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
        BufferedReader br = new BufferedReader(new FileReader(originalFile));
        String line;
            try {
                while((line = br.readLine()) != null){
                    String[] data = line.split(" ");
                    String employeeId = data[0];
                    if(employeeId.equals(id)){
                        System.out.println("Id found");
                        System.out.println("Enter name to update :");
                        String name = sc.nextLine();
                        data[1]=name;
                        System.out.println("Enter Age to update :");
                        int age = sc.nextInt();
                        data[2]=name;
                        System.out.println("Enter Salary to update :");
                        Double salary = sc.nextDouble();
                        data[3]=name;
                        employeeFound=true;
                        line = id + " " + name + " " + " " + age + " " + salary;
                    }
                    pw.write(line);
                    pw.println();
                }
            pw.close();
            br.close();
            if(originalFile.exists()){           
            originalFile.delete();
            System.out.println("original file deleted successfully");
            }
            tempFile.renameTo(originalFile);           
            if (employeeFound) {
                System.out.println("Employee data updated successfully.");
            } else {
                System.out.println("Employee data not found.");
            }
            } catch (FileNotFoundException e) {
                System.out.println("File not Found..");
            }
}

   public void displayEmployee() throws IOException{
    BufferedReader readfile  = new BufferedReader(new FileReader("employee.txt"));
            String line;
            while((line = readfile.readLine()) != null)    
            System.out.println(line);
            readfile.close();
    }
}
 
public class EmployeeMain  {        
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    EmployeeManagement empmanage = new EmployeeManagement(); 
       while(true){
       System.out.println("Employee Management Application");
       System.out.println("1. Add Employee");
       System.out.println("2. Display Employee");
       System.out.println("3. Update Employee");
       System.out.println("4. Delete Employee");
       System.out.println("5. For exit : ");
       System.out.print("Enter Your Choice : ");      
       int choice = sc.nextInt(); sc.nextLine();           
       switch(choice){
           case 1 :  
               empmanage.addEmployee(sc); 
                break;
           case 2 :  
               empmanage.displayEmployee(); 
                break;
           case 3 :  
               empmanage.updateEmployee(sc); 
                break;
           case 4 : 
              empmanage.deleteEmployee(sc);
              break;
           case 5:
              System.exit(0);
              break;
            default :
                System.out.println("Invalid choice..");
       }
     }  
    }
}
