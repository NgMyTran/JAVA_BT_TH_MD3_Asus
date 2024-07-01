package session14.bt3VIP.bussiness;

import session14.bt3VIP.entity.Department;
import session14.bt3VIP.entity.Employee;
import static session14.bt3VIP.bussiness.DepartmentBussiness.departments;
import static session14.bt3VIP.bussiness.EmployeeBussiness.employees;

import java.util.List;

public interface IEmployeeDesign extends IGenericDesign<Employee, String>{
//    List<Employee> findByName(String name);
//    boolean existByDepartmentId(String depId);

    //thong ke so luong nhan vien trung binh moi phong
    public int callEmployeeAvg();
    //tim 5 department co nhieu employee nhat
    List<Department> mostCrowded();
    //tim ra ng quan ly nhieu nhan vien nhat
    Employee manageMostEmployee();
    //5 nhan vien co tuoi lon nhat cty
    List<Employee> oldestEmployee();
    //5 nv salary cao nhat
    List<Employee> highestSalaryEmployee();
}
