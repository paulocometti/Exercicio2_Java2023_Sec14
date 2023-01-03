package entities;

public abstract class Person {
	private String name;
	private Double anual;
	
	public Person() {
	}
	
	public Person(String name, Double anual) {
		this.name = name;
		this.anual = anual;
	}
	
	public String getName() {
		return name;
	}
	public Double getAnual() {
		return anual;
	}
	
	public abstract Double totalTax();
	
}
