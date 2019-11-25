package guru.springframework.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.domain.Category;
import guru.springframework.domain.Customer;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.CustomerRepository;

/**
 * Created by jt on 9/24/17.
 */
@Component
public class Bootstrap implements CommandLineRunner{

    private CategoryRepository categoryRespository;
    private CustomerRepository customerRespository;

    public Bootstrap(CategoryRepository categoryRespository, CustomerRepository customerRespository) {
		this.categoryRespository = categoryRespository;
		this.customerRespository = customerRespository;
	}

	@Override
    public void run(String... args) throws Exception {
    	
    	fillCategories();
    	fillCustomers();
    }

	private void fillCustomers() {
		
		Customer person1 = new Customer();
		person1.setFirstName("Amr");
		person1.setLastName("Eshra");
		
		Customer person2 = new Customer();
		person2.setFirstName("Ola");
		person2.setLastName("Magdy");
		
		Customer person3 = new Customer();
		person3.setFirstName("Farida");
		person3.setLastName("Amr");
		
		customerRespository.save(person1);
		customerRespository.save(person2);
		customerRespository.save(person3);

        System.out.println("Customers Data Loaded = " + customerRespository.count() );
		
	}

	private void fillCategories() {
		
		Category fruits = new Category();
        fruits.setName("Fruits");

        Category dried = new Category();
        dried.setName("Dried");

        Category fresh = new Category();
        fresh.setName("Fresh");

        Category exotic = new Category();
        exotic.setName("Exotic");

        Category nuts = new Category();
        nuts.setName("Nuts");
        
        Category sliced = new Category();
        sliced.setName("Sliced");

        categoryRespository.save(fruits);
        categoryRespository.save(dried);
        categoryRespository.save(fresh);
        categoryRespository.save(exotic);
        categoryRespository.save(nuts);
        categoryRespository.save(sliced);

        System.out.println("Categories Data Loaded = " + categoryRespository.count() );

	}

}
