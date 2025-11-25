package net.javaRest.newPath.repository;

import net.javaRest.newPath.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
