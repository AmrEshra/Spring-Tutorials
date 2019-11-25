package com.edureka.controller;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edureka.dto.EmployeeDTO;
import com.edureka.services.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	private final EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
	
	@GetMapping
    public ResponseEntity<List<EmployeeDTO>> getAllEmployee(){
		List<EmployeeDTO> employeeDTOList = employeeService.getAllEmployees();
		HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(employeeDTOList, responseHeaders, HttpStatus.OK);
    }
	
	@GetMapping("/{name}")
    public ResponseEntity<EmployeeDTO> getEmployeeByName(@PathVariable String name){
		EmployeeDTO employeeDTO = employeeService.getEmployeeByName(name);
		HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(employeeDTO, responseHeaders, HttpStatus.OK);
    }
}
