package guru.springframework.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PRL_FINANCIAL_ELEMENTS")
public class FinancialElement {
	
	private Long id;
	private String code;
	private String name;
	private Integer elementNatural;
	private Integer elementEffect;
	private Integer insertInSalaryPayroll;
	
	@Id
	@Column(name="ID")
	@SequenceGenerator(name = "SEQ_PRL_FINANCIAL_ELEMENTS", sequenceName = "SEQ_PRL_FINANCIAL_ELEMENTS", allocationSize = 1)  
	@GeneratedValue(generator = "SEQ_PRL_FINANCIAL_ELEMENTS", strategy = GenerationType.SEQUENCE)
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Basic
	@Column(name="CODE")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	@Basic
	@Column(name="NAME")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name != null)
			this.name = name.trim();
		else
			this.name = name;
	}
	
	@Basic
	@Column(name="ELEMENT_NATURAL")
	public Integer getElementNatural() {
		return elementNatural;
	}
	
	public void setElementNatural(Integer elementNatural) {
		this.elementNatural = elementNatural;
	}
	
	@Basic
	@Column(name="ELEMENT_EFFECT")
	public Integer getElementEffect() {
		return elementEffect;
	}
	
	public void setElementEffect(Integer elementEffect) {
		this.elementEffect = elementEffect;
	}
	
	@Basic
	@Column(name="INSERT_IN_SALARY_PAYROLL")
	public Integer getInsertInSalaryPayroll() {
		return insertInSalaryPayroll;
	}

	public void setInsertInSalaryPayroll(Integer insertInSalaryPayroll) {
		this.insertInSalaryPayroll = insertInSalaryPayroll;
	}
	
}