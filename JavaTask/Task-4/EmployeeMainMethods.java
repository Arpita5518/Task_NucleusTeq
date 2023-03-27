import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
public class EmployeeMainMethods {
    public void addEmployee(Scanner sc, HashSet<String> idset) {
        System.out.print("Enter Employee id : ");      
        String id = sc.nextLine();
        while(idset.contains(id)){
        System.out.println("id already exist in set. ");
        System.out.print("Re-Enter id: ");
        id=sc.nextLine();
        }
        idset.add(id);
        System.out.print("Enter Employee Age : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Employee salary : ");
        Double salary = sc.nextDouble();
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

    public void deleteEmployee(Scanner sc, HashSet<String> idset) throws IOException {
        System.out.print("Enter id to delete :");
        String id = sc.nextLine();
        boolean employeeFound = false;
        File tempFile = new File("temp_employee.txt");
        File originalFile = new File("employee.txt");

        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
        BufferedReader br = new BufferedReader(new FileReader(originalFile));
        String line;
        try {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");
                String employeeId = data[0];
                if (employeeId.equals(id)) {
                    System.out.println("Id found"); idset.remove(id);
                    employeeFound = true;
                    continue;
                }
                pw.write(line);
                pw.println();
            }
            pw.close();
            br.close();
            if (originalFile.exists()) {
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
        boolean employeeFound = false;
        File tempFile = new File("temp_employee.txt");
        File originalFile = new File("employee.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
        BufferedReader br = new BufferedReader(new FileReader(originalFile));
        String line;
        try {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");
                String employeeId = data[0];
                if (employeeId.equals(id)) {
                    System.out.println("Id found");
                    System.out.println("Enter name to update :");
                    String name = sc.nextLine();
                    data[1] = name;
                    System.out.println("Enter Age to update :");
                    int age = sc.nextInt();
                    data[2] = name;
                    System.out.println("Enter Salary to update :");
                    Double salary = sc.nextDouble();
                    data[3] = name;
                    employeeFound = true;
                    line = id + " " + name + " " + " " + age + " " + salary;
                }
                pw.write(line);
                pw.println();
            }
            pw.close();
            br.close();
            if (originalFile.exists()) {
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

    public void displayEmployee(Scanner sc, HashSet<String> set) throws IOException {
        BufferedReader readfile = new BufferedReader(new FileReader("employee.txt"));
        String line;
        System.out.println("Enter id to display : ");
        String id = sc.nextLine();
        if(set.contains(id)){
        while ((line = readfile.readLine()) != null){
            String[] data = line.split(" ");
            String employeeId = data[0];
            if(employeeId.equals(id))
            System.out.println(line);
        }
    }
    else
    System.out.println("id doesn't exist. ");
    readfile.close();
    }
    void readIDsFromFile(HashSet<String> idset) throws IOException{
        try{
            BufferedReader idReader = new BufferedReader(new FileReader("employee_ids.txt"));
            String line = idReader.readLine();
            while (line != null && !line.isEmpty()) {
                idset.add(line);
                line = idReader.readLine();
            }
            idReader.close();
           }catch(FileNotFoundException e){
            System.out.println(e);
           }
    }
   
}
