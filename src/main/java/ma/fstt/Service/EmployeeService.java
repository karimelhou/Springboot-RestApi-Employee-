package ma.fstt.Service;

import ma.fstt.Entity.Employe;

import java.util.List;

public interface EmployeeService {
    Employe saveEmployee(Employe employee);

    List<Employe> fetchAllEmployees();

    Employe getEmployeeById(Long id);

    Employe updateEmployeeById(Long id, Employe employee);

    String deleteDepartmentById(Long id);
}
