package entities;

import java.text.Format;

public class PersonCompany extends Person {
	private Integer employees;
	
	public PersonCompany() {}

	public PersonCompany(String name, Double anual, Integer employees) {
		super(name, anual);
		this.employees = employees;
	}

	public final Double taxCompany() {
		if(employees > 10) {
			return getAnual()*(14/100);
		} else {
			return getAnual()*(16/100);
		}
	}
	
	public final Double taxComp() {
		double anual = getAnual();
		return employees>10 ? anual*0.14 : anual*0.16;
	}
	
	@Override
	public Double totalTax() {
		return taxComp();
	}
	
	@Override
	public String toString() {
		return getName()+" : $ "+ String.format("%.2f", taxComp());
	}
	
}
