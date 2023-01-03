package entities;

public class PersonIndividual extends Person {
	private Double health;
	
	public PersonIndividual() {}

	public PersonIndividual(String name, Double anual, Double health) {
		super(name, anual);
		this.health = health;
	}

	@Override
	public Double tax(){
		if(getAnual()>=20000.00) {
			if(health > 0) {
				return (getAnual()*0.25)-(health*0.5);
			}
			else if(health == 0) {
				return getAnual()*0.25;
			}
		}
		else if(getAnual()<20000.00) {
			if(health > 0) {
				return (getAnual()*0.15)-(health*0.5);
			}
			else if(health == 0) {
				return getAnual()*0.15;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return getName()+": $ "+ String.format("%.2f", tax());
	}

	
	
}
