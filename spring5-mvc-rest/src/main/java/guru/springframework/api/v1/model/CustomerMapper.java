package guru.springframework.api.v1.model;

import java.util.ArrayList;
import java.util.List;

import guru.springframework.domain.Customer;

/**
 * Created by jt on 9/25/17.
 */
public class CustomerMapper {

    public CustomerMapper() {
	}

	public static CustomerDTO customerToCustomerDTO(Customer customer) {
		
		CustomerDTO CustomerDTO = new CustomerDTO();
		CustomerDTO.setId(customer.getId());
		CustomerDTO.setFirstName(customer.getFirstName());
		CustomerDTO.setLastName(customer.getLastName());
		
		return CustomerDTO;
	};
	
	public static List<CustomerDTO> customerListToCustomerDTOList(List<Customer> customerList) {
		
		List<CustomerDTO> customerDTOList = new ArrayList<>();
		
		for(Customer customer : customerList) {
			customerDTOList.add(customerToCustomerDTO(customer));
		}
		
		return customerDTOList;
	};
}
