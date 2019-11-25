package com.edureka.services;

import java.util.ArrayList;
import java.util.List;

import com.edureka.dto.EmployeeDTO;
import com.edureka.model.Employee;

public class EmployeeDTOTransformer {
	
    public EmployeeDTO tranformToEmployeeDTO(Employee employee) {
    	
        return EmployeeDTO.builder()
                .name(employee.getName())
                .designation(employee.getDesignation())
                .salary(employee.getSalary())
                .build();
    }
    
    public List<EmployeeDTO> tranformToDTOList(List<Employee> employeeList) {
    	
    	List<EmployeeDTO> employeeDTOList = new ArrayList<>();
    	
    	for(Employee employee : employeeList)
    		employeeDTOList.add(EmployeeDTO.builder()
    				.name(employee.getName())
                    .designation(employee.getDesignation())
                    .salary(employee.getSalary())
                    .build());
    	
    	return employeeDTOList;
    }
}