package net.javaRest.newPath.service;

import net.javaRest.newPath.dto.EmployeeDto;
import net.javaRest.newPath.entity.Employee;

public interface EmployeeService {
    EmployeeDto UpsertEmployee(EmployeeDto detail);

    EmployeeDto GetEmployeeById(Long id);
}
