package guru.springframework.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.model.FinancialElementDTO;
import guru.springframework.model.FinancialElementMapper;
import guru.springframework.repositories.FinancialElementRepository;

/**
 * Created by jt on 1/10/17.
 */
@Service
public class FinancialElementServiceImpl implements FinancialElementService {

    private FinancialElementRepository financialElementRepository;

    @Autowired
    public FinancialElementServiceImpl(FinancialElementRepository productRepository) {
        this.financialElementRepository = productRepository;
    }

    @Override
    public List<FinancialElementDTO> listAll() {
    	return FinancialElementMapper.financialElementListToFinancialElementDTOList(financialElementRepository.findAll());
    }

    @Override
    public FinancialElementDTO getById(Long id) {
        return FinancialElementMapper.financialElementToFinancialElementDTO(financialElementRepository.findById(id));
    }

	@Override
	public FinancialElementDTO getByName(String name) {
		return FinancialElementMapper.financialElementToFinancialElementDTO(financialElementRepository.findByName(name));
	}
}
