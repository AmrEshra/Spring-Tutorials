package guru.springframework.model;

import java.util.ArrayList;
import java.util.List;

import guru.springframework.domain.FinancialElement;

/**
 * Created by jt on 9/25/17.
 */
public class FinancialElementMapper {

    public FinancialElementMapper() {
	}

	public static FinancialElementDTO financialElementToFinancialElementDTO(FinancialElement financialElement) {
		
		FinancialElementDTO financialElementDTO = new FinancialElementDTO();
		financialElementDTO.setId(financialElement.getId());
		financialElementDTO.setCode(financialElement.getCode());
		financialElementDTO.setName(financialElement.getName());
		financialElementDTO.setElementEffect(financialElement.getElementEffect());
		financialElementDTO.setElementNatural(financialElement.getElementNatural());
		financialElementDTO.setInsertInSalaryPayroll(financialElement.getInsertInSalaryPayroll().equals(1) ? true : false);
		return financialElementDTO;
	};
	
	public static List<FinancialElementDTO> financialElementListToFinancialElementDTOList(List<FinancialElement> financialElementList) {
		
		List<FinancialElementDTO> financialElementDTOList = new ArrayList<>();
		
		for(FinancialElement financialElement : financialElementList) {
			financialElementDTOList.add(financialElementToFinancialElementDTO(financialElement));
		}
		
		return financialElementDTOList;
	};
}
