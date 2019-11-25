package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Resource implements Serializable {

	private String name;
	private Integer year;
	private String color;
	private String pantoneValue;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	private final static long serialVersionUID = 270727596527329664L;	private Integer id;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPantoneValue() {
		return pantoneValue;
	}

	public void setPantoneValue(String pantoneValue) {
		this.pantoneValue = pantoneValue;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}