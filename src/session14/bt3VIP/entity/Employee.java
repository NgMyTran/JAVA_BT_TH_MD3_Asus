package session14.bt3VIP.entity;

import session14.bt3VIP.util.InputMethods;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee implements IManagement{
    private String employeeId, employeeName;
    private static int autoId=0;
    private boolean sex;
    private LocalDate birthday;
    private double salary;
    Employee manager;
    Department department;
    private static ArrayList<Employee> employees ;
    private boolean gender;

    public Employee() {
        this.employeeId = String.format("E%05d",++autoId);
    }
    public Employee(String employeeId, String employeeName, boolean sex, LocalDate birthday, double salary, Employee manager, Department department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.sex = sex;
        this.birthday = birthday;
        this.salary = salary;
        this.manager = manager;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public static ArrayList<Employee> getEmployees() {
        return employees;
    }

    public static void setEmployees(ArrayList<Employee> employees) {
        Employee.employees = employees;
    }

//    public Employee input(){
//        Employee d = new Employee();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter employee ID: ");
//        employeeId = sc.nextLine();
//        System.out.println("Enter employee Name: ");
//        employeeName = sc.nextLine();
//        System.out.println("Enter employee sexual: ");
//        sex = sc.nextLine();
//        System.out.println("Enter salary: ");
//        salary = Double.parseDouble(sc.nextLine());
//        System.out.println("Enter employee birthday: ");
//        birthday = LocalDate.ofEpochDay(Integer.parseInt(sc.nextLine()));
//        return d;
//    }
//
//    public void addEmployee() {
//        employees.add(input());
//        System.out.println("Thêm thành công.");
//    }
//    public void removeDepartment() {
//        if(!employees.isEmpty() && this.getEmployeeId()==id){
//            employees.remove(employees.size()-1);
//        }
//    }
//    public void updateDepartment() {
//        for (int i = 0; i < employees.size(); i++) {
//            if (employees.get(i).getEmployeeId().equals(id)) {
//                employees.set(i, this);
//                break;
//            }
//        }
//    }
//
//    public void serachEmployee() {
//        boolean found = false;
//        for(Employee e : employees){
//            if(department.getId().equals(id)){
//                System.out.println(department.getDepartmentName());
//                found = true;
//            }
//        }
//    }

    @Override
    public void inputData() {
        System.out.println("Enter employee ID: ");
        this.employeeId = InputMethods.getString();
        System.out.println("Enter employee Name: ");
        this.employeeName = InputMethods.getString();
        System.out.println("Enter Gender: ");
       this.gender=InputMethods.getBoolean();
//        while(!genderInput.equalsIgnoreCase("male") && !genderInput.equalsIgnoreCase("female")){
//            System.out.println("Invalid Gender. Write male or Female: ");
//            genderInput=InputMethods.getString();
//        }
//        switch(genderInput){
//            case "male":
//                boolean gender = true;
//                break;
//            case "Female":
//                gender = false;
//                break;
//            default:
//                System.out.println("Invalid choice. Enter male or Female");;
//                break;
//        }
        System.out.println("Enter salary: ");
        this.salary = InputMethods.getDouble();
        System.out.println("Enter employee birthday: ");
        this.birthday = InputMethods.getDate();
        System.out.println("Danh sách danh mục");
        for (int i = 1 ;i<= employees.size();i++){
            System.out.printf("|STT : %-3s | Name : %-15s |\n",i,employees.get(i-1).getEmployeeName());
        }
        System.out.println("Moi ban chon phong ban cho manager");
        while (true){
            int index = InputMethods.getInteger();
            if (index >=1 && index <= employees.size()){
                this.manager = employees.get(index-1);
                break;
            }else {
                System.err.println("Nhap khong chinh xac , vui long nhap lai");
            }
        }
    }

    @Override
    public void displayData() {
        System.out.println("Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", salary=" + salary +
                ", manager=" + manager +
                ", department=" + department +
                '}');
    }
}
