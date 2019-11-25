package guru.springframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.domain.FinancialElement;

/**
 * Created by jt on 1/10/17.
 */
public interface FinancialElementRepository extends JpaRepository<FinancialElement, Long> {

	FinancialElement findById(Long id);

	FinancialElement findByName(String name);
	
}
