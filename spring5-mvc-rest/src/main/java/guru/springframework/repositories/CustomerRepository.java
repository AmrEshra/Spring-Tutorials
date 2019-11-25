package guru.springframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.domain.Customer;

/**
 * Created by jt on 9/24/17.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
