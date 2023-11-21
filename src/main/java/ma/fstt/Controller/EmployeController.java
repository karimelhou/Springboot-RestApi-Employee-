package ma.fstt.Controller;

import ma.fstt.Entity.Employe;
import ma.fstt.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employe")
    public Employe saveEmploye(@RequestBody Employe employe){
        return employeeService.saveEmployee(employe);
    }

    @GetMapping("/employe")
    public List<Employe> getAllEmploye(){
        return employeeService.fetchAllEmployees();
    }

    @GetMapping("/employe/{id}")
    public Employe getEmployebyId(@PathVariable("id") Long id){
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/employe/{id}")
    public Employe updateEmploye(@PathVariable("id") Long id, @RequestBody Employe employe){
        return employeeService.updateEmployeeById(id, employe);
    }

    @DeleteMapping("employe/{id}")
    public String deleteEmploye(@PathVariable("id") Long id){
        return employeeService.deleteDepartmentById(id);
    }




}
