package com.edureka;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;

import com.edureka.dto.EmployeeDTO;
import com.edureka.services.EmployeeService;

public class EmployeeTest {

    @Mock
    EmployeeService employeeService;

    MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testListEmployees() throws Exception {
        EmployeeDTO employee1 = new EmployeeDTO();
        employee1.setName("Ahmed");

        EmployeeDTO employee2 = new EmployeeDTO();
        employee2.setName("Osama");

        List<EmployeeDTO> employees = Arrays.asList(employee1, employee2);

        when(employeeService.getAllEmployees()).thenReturn(employees);

        assertEquals(3, employees.size());
    }

    @Test
    public void testGetByNameEmployees() throws Exception {
    	
    	final String NAME = "Farida";
    	final String DESIGNATION = "Doctor";
    	final Double SALARY = 25000D;
    	    	
        EmployeeDTO employee1 = new EmployeeDTO();
        employee1.setName(NAME);
        employee1.setDesignation(DESIGNATION);
        employee1.setSalary(SALARY);

        when(employeeService.getEmployeeByName(anyString())).thenReturn(employee1);
        assertEquals(NAME, employee1.getName());
        assertEquals(DESIGNATION, employee1.getDesignation());
        assertEquals(SALARY, employee1.getSalary());

    }
}