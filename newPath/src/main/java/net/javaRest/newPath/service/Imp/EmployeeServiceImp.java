package net.javaRest.newPath.service.Imp;

import lombok.AllArgsConstructor;
import net.javaRest.newPath.dto.EmployeeDto;
import net.javaRest.newPath.entity.Employee;
import net.javaRest.newPath.mapper.EmployeeMapper;
import net.javaRest.newPath.repository.EmployeeRepository;
import net.javaRest.newPath.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class EmployeeServiceImp implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto UpsertEmployee(EmployeeDto detail) {

        Employee employee = EmployeeMapper.DtoToEmployee(detail);
        Employee savedEmployee =  employeeRepository.save(employee);

        return EmployeeMapper.employeeToDto(savedEmployee);
    }

    @Override
    public EmployeeDto GetEmployeeById(Long id) {
        Employee employee = employeeRepository.getReferenceById(id);
        return EmployeeMapper.employeeToDto(employee);
    }
}
