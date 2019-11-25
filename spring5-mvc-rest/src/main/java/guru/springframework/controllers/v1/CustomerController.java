package guru.springframework.controllers.v1;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.api.v1.model.CustomerDTO;
import guru.springframework.services.CustomerService;

/**
 * Created by jt on 9/26/17.
 */
@RestController
@RequestMapping("/api/v1/customers/")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<CustomerDTO> getAllCatetories(){

        return customerService.getAllCustomers();
    }

    @GetMapping("{/id}")
    public CustomerDTO getCustomerByName(@PathVariable Long id){
        return customerService.getCustomerById(id);
    }
    
    @PostMapping
    public CustomerDTO createNewCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.createNewCustomer(customerDTO);
    }
    
    @PutMapping({"/{id}"})
    public CustomerDTO updateCustomer(@PathVariable Long id, @RequestBody CustomerDTO customerDTO){
        return customerService.updateCustomer(id, customerDTO);
    }
    
    @DeleteMapping({"/{id}"})
    public void deleteCustomer(@PathVariable Long id){
    	customerService.deleteCustomer(id);
    }
}
