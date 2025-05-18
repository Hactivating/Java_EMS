package net.project.ems.controller;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.project.ems.dto.EmployeeDto;
import net.project.ems.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //spring mvc rest controller to handle http requests
@RequestMapping("/api/employees") //base url for all
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    //Build add employee REST API

    @PostMapping                                //extract json from the request and convert that into employeeddto java object
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){ //RETURNS A SAVED EMPLOYYEE
        EmployeeDto savedEmployee = employeeService.createEmployeeDto(employeeDto);
        return  new ResponseEntity<>(savedEmployee, HttpStatus.CREATED); //TO RETURN THE SAVED EMPLOYEE
    }
}
