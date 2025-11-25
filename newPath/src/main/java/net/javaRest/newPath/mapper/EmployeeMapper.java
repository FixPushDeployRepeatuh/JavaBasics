package net.javaRest.newPath.mapper;

import net.javaRest.newPath.dto.EmployeeDto;
import net.javaRest.newPath.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto employeeToDto(Employee e)
    {
        return new EmployeeDto(
                e.getId(),
                e.getName(),
                e.getSurname(),
                e.getEmail()
        );
    }

    public static Employee DtoToEmployee(EmployeeDto e)
    {
        return new Employee(
                e.getId(),
                e.getFirstName(),
                e.getLastName(),
                e.getEmail()
        );
    }
}
