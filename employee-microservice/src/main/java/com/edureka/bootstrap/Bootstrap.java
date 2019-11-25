package com.edureka.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.edureka.model.Employee;
import com.edureka.repository.EmployeeRepository;

/**
 * Created by jt on 9/24/17.
 */
@Component
public class Bootstrap implements CommandLineRunner {

	private EmployeeRepository employeeRespository;

	public Bootstrap(EmployeeRepository employeeRespository) {
		this.employeeRespository = employeeRespository;
	}

	@Override
	public void run(String... args) throws Exception {
		fillEmployees();
	}

	private void fillEmployees() {

		Employee amr = Employee.builder().name("Amr").designation("Team Leader").salary(1000D).build();

		Employee ali = Employee.builder().name("Ali").designation("Engineer").salary(9800D).build();

		Employee ola = Employee.builder().name("Ola").designation("Accountant").salary(15500D).build();

		Employee farida = Employee.builder().name("Farida").designation("Doctor").salary(20000D).build();

		employeeRespository.save(amr);
		employeeRespository.save(ali);
		employeeRespository.save(ola);
		employeeRespository.save(farida);

		System.out.println("Employees Data Loaded = " + employeeRespository.count());

	}

}
