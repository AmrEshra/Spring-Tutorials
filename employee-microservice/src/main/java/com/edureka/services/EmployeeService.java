package com.edureka.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edureka.dto.EmployeeDTO;
import com.edureka.model.Employee;
import com.edureka.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
    EmployeeRepository employeeRepository;
	
    public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public List<EmployeeDTO> getAllEmployees() {
    	
        List<Employee> employeeList = employeeRepository.findAll();
        List<EmployeeDTO> employeeDTOList = new EmployeeDTOTransformer().tranformToDTOList(employeeList);
        return employeeDTOList;
    }
    
    public EmployeeDTO getEmployeeByName(String name) {
    	
        Optional<Employee> employee = employeeRepository.findByName(name);
        EmployeeDTO employeeDTO = new EmployeeDTOTransformer().tranformToEmployeeDTO(employee.get());
        return employeeDTO;
    }
}
