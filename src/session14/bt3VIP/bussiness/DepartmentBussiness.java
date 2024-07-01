package session14.bt3VIP.bussiness;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import session14.bt3VIP.entity.Department;


public class DepartmentBussiness implements IDepartmentDesign{
    public static List<Department> departments = new ArrayList<>();

    @Override
    public void create(Department department) {
        departments.add(department);
    }

    @Override
    public List<Department> findAll() {
        return departments;
    }

    @Override
    public void update(Department department) {
        departments.set(departments.indexOf(findById(department.getId())), department);
    }

    @Override
    public void delete(String id) {
//        departments.remove(findById(id));
//        return true;
        departments.removeIf(department -> department.getId().equals(id));
    }

    @Override
    public Optional<Department> findById(String id) {
        for(Department d : departments){
            if(d.getId().equals(id)){
            }
        }
        return null;
    }
}
