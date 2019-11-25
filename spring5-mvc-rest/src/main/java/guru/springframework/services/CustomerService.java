package guru.springframework.services;

import java.util.List;

import guru.springframework.api.v1.model.CustomerDTO;

/**
 * Created by jt on 9/26/17.
 */
public interface CustomerService {

    List<CustomerDTO> getAllCustomers();

    CustomerDTO getCustomerById(Long Id);
    
    CustomerDTO createNewCustomer(CustomerDTO customerDTO);
    
    CustomerDTO updateCustomer(Long id, CustomerDTO customerDTO);
    
    void deleteCustomer(Long id);
}
