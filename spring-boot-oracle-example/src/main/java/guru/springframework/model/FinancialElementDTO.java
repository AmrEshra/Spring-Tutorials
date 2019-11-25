package guru.springframework.model;

import lombok.Data;

/**
 * Created by jt on 9/24/17.
 */
@Data
public class FinancialElementDTO {
   
	private Long id;
	private String code;
	private String name;
	private Integer elementNatural;
	private Integer elementEffect;
	private Boolean insertInSalaryPayroll;
	
}
