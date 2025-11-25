package net.javaRest.newPath.controller;

import lombok.AllArgsConstructor;
import net.javaRest.newPath.dto.EmployeeDto;
import net.javaRest.newPath.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("Employee")
public class EmployeeController {
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDto> AddEmployee(@RequestBody EmployeeDto detail){
        var success = employeeService.UpsertEmployee(detail);
        return new ResponseEntity<>(success, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<EmployeeDto> GetAllEmployees(@RequestParam Long id){
        var response = employeeService.GetEmployeeById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
