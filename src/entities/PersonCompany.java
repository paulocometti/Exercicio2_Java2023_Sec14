package entities;

public class PersonCompany extends Person {
	private Integer employees;
	
	public PersonCompany() {}

	public PersonCompany(String name, Double anual, Integer employees) {
		super(name, anual);
		this.employees = employees;
	}

	@Override
	public Double tax(){
		double anual = getAnual();
		return employees>10 ? anual*0.14 : anual*0.16;
	}
	
	@Override
	public String toString() {
		return getName()+" : $ "+ String.format("%.2f", tax());
	}
	
}
