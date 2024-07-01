package session14.bt3VIP.bussiness;

import session14.bt3VIP.entity.Department;
import session14.bt3VIP.entity.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class EmployeeBussiness implements IEmployeeDesign{
    static List<Employee> employees= new ArrayList<>();


    @Override
    public int callEmployeeAvg() {
        return 0;
    }

    @Override
    public List<Department> mostCrowded() {
        return Collections.emptyList();
    }

    @Override
    public Employee manageMostEmployee() {
        return null;
    }

    @Override
    public List<Employee> oldestEmployee() {
        return Collections.emptyList();
    }

    @Override
    public List<Employee> highestSalaryEmployee() {
        return Collections.emptyList();
    }

    @Override
    public void create(Employee employee) {

    }

    @Override
    public List<Employee> findAll() {
        return Collections.emptyList();
    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Optional<Employee> findById(String id) {
        return Optional.empty();
    }
}
