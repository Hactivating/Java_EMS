package net.project.ems.service.impl;

import lombok.AllArgsConstructor;
import net.project.ems.dto.EmployeeDto;
import net.project.ems.entity.Employee;
import net.project.ems.mapper.EmployeeMapper;
import net.project.ems.repository.EmployeeRepository;
import net.project.ems.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service //tells spring container to create spring bean for this class
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployeeDto(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.maptoEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);


        return EmployeeMapper.maptoEmployeeDto(savedEmployee);



    }
}
