package session14.bt3VIP.entity;

import session14.bt3VIP.util.InputMethods;

import java.util.ArrayList;

public class Department implements IManagement{
    private String departmentId, departmentName ;
    private int totalMembers;
    private static int autoId=1;
    private static ArrayList<Department> departments = new ArrayList<Department>();
    Employee employee;


    public Department() {
        this.departmentId = String.format("D%04d",++autoId);
    }
    public Department(String departmentId, String departmentName, int totalMembers) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.totalMembers = totalMembers;
    }

    public String getId() {
        return departmentId;
    }

    public void setId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getTotalMembers() {
        return totalMembers;
    }

    public void setTotalMembers(int totalMembers) {
        this.totalMembers = totalMembers;
    }

    public static ArrayList<Department> getDepartments() {
        return departments;
    }

    public static void setDepartments(ArrayList<Department> departments) {
        Department.departments = departments;
    }
//
//    public void addEmployee() {
//        if (employee != null && !Employee.getEmployees().contains(employee)) {
//            Employee.getEmployees().add(employee);
//            employee.setDepartment(this);
//            totalMembers++;
//        }
//    }
//
//    public Department input(){
//        Department d = new Department();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter ID: ");
//        id = sc.nextLine();
//        System.out.println("Enter Department Name: ");
//        departmentName = sc.nextLine();
//        return d;
//    }
//    public void addDepartment() {
//        departments.add(input());
//        System.out.println("Thêm sách thành công.");
//        totalMembers++;
//    }
//    public void removeDepartment() {
//        if(!departments.isEmpty() && this.getId()==id){
//            departments.remove(departments.size()-1);
//        }
//    }
//    public void updateDepartment() {
//        for (int i = 0; i < departments.size(); i++) {
//            if (departments.get(i).getId().equals(id)) {
//                departments.set(i, this);
//                break;
//            }
//        }
//    }
//
//    public void serachEmployee() {
//        boolean found = false;
//        for(Department department : departments){
//            if(department.getId().equals(id)){
//                System.out.println(department.getDepartmentName());
//                found = true;
//            }
//        }
//    }


    @Override
    public void inputData() {
        System.out.println("Nhập tên danh mục :");
        this.departmentName=InputMethods .getString();
        System.out.println("Tong so nhan vien");
        this.totalMembers=InputMethods.getInteger();

    }

    @Override
    public void displayData() {
        System.out.printf("|ID : %-4s | Name: %-15s | Total: %-2s \n",departmentId,departmentName,totalMembers);
    }
}
