package net.project.ems.repository;

import net.project.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//extending JpaRepository will give useful methods for the repo handling
public interface EmployeeRepository extends JpaRepository<Employee,Long> {//entity type and entitys PK type {


}
