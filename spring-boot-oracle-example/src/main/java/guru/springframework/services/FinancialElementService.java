package guru.springframework.services;

import java.util.List;

import guru.springframework.model.FinancialElementDTO;

/**
 * Created by jt on 1/10/17.
 */
public interface FinancialElementService {

    List<FinancialElementDTO> listAll();

    FinancialElementDTO getById(Long id);
    
    FinancialElementDTO getByName(String name);

}
