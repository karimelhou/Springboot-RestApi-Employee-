package ma.fstt.Service;

import ma.fstt.Entity.Employe;
import ma.fstt.Repo.EmployeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeRepo employeRepo;
    @Override
    public Employe saveEmployee(Employe employee) {
        return employeRepo.save(employee);
    }

    @Override
    public List<Employe> fetchAllEmployees() {
        List<Employe> AllEmploye = employeRepo.findAll();
        return AllEmploye;
    }

    @Override
    public Employe getEmployeeById(Long id) {
        Optional<Employe> myemploye = employeRepo.findById(id);
        if (myemploye.isPresent()){
            return myemploye.get();
        }
        return null;
    }

    @Override
    public Employe updateEmployeeById(Long id, Employe employee) {
        Optional<Employe> myemploye = employeRepo.findById(id);
        if (myemploye.isPresent()){
            Employe originalEmploye = myemploye.get();

            if (Objects.nonNull(employee.getEmployename()) && !"".equalsIgnoreCase(employee.getEmployename())){
                originalEmploye.setEmployename(employee.getEmployename());
            }
            if(Objects.nonNull(employee.getEmployeSalary()) && employee.getEmployeSalary() != 0){
                originalEmploye.setEmployeSalary(employee.getEmployeSalary());
            }
            return employeRepo.save(originalEmploye);
        }
        return null;
    }

    @Override
    public String deleteDepartmentById(Long id) {
        if (employeRepo.findById(id).isPresent()){
            employeRepo.deleteById(id);
            return "Employee had been deleted ";
        }
        return "Employee not found";
    }
}
