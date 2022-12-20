package s1_7_niv1_ex1_montseliz;

public class Employee {

	private String name;
	private String surname; 
	private int priceHour;  
	
	public Employee(String name, String surname, int priceHour) {
		this.name = name; 
		this.surname = surname; 
		this.priceHour = priceHour; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getPriceHour() {
		return priceHour;
	}

	public void setPriceHour(int priceHour) {
		this.priceHour = priceHour;
	}
	
	public String calculateSalary(int hoursWorked) {
		int salary = hoursWorked * this.priceHour;
		return "El seu sou mensual és de " + salary + "."; 
	}
	
	@Override
	public String toString() {
		return "El/la treballador/a " + this.name + " " + this.surname + " cobra " + this.priceHour + "€ l'hora.";
		
	}
	
}
