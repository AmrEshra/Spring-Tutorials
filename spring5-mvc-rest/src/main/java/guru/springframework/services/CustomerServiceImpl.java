package guru.springframework.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import guru.springframework.api.v1.model.CustomerDTO;
import guru.springframework.api.v1.model.CustomerMapper;
import guru.springframework.domain.Customer;
import guru.springframework.repositories.CustomerRepository;

/**
 * Created by jt on 9/26/17.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

	@Override
	public List<CustomerDTO> getAllCustomers() {
		return CustomerMapper.customerListToCustomerDTOList(customerRepository.findAll());
	}

	@Override
	public CustomerDTO getCustomerById(Long Id) {
		Optional<Customer> customer = customerRepository.findById(Id);
    	if(customer == null)
    		return new CustomerDTO();
        return CustomerMapper.customerToCustomerDTO(customer.get());
	}

	@Override
	public CustomerDTO createNewCustomer(CustomerDTO customerDTO) {
		Customer customer = new Customer(customerDTO.getFirstName() , customerDTO.getLastName());
		customer = customerRepository.save(customer);
		
		return CustomerMapper.customerToCustomerDTO(customer);
	}

	@Override
	public CustomerDTO updateCustomer(Long id, CustomerDTO customerDTO) {
		Customer customer = new Customer(customerDTO.getFirstName() , customerDTO.getLastName());
		customer.setId(id);
		customer = customerRepository.saveAndFlush(customer);
		
		return CustomerMapper.customerToCustomerDTO(customer);
	}

	@Override
	public void deleteCustomer(Long id) {
		customerRepository.deleteById(id);
	}
}
