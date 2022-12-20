package s1_7_niv1_ex1_montseliz;

public class OfficeEmployee extends Employee{

	private static float petrol; 
	
	public OfficeEmployee (String name, String surname, int priceHour) {
		super(name, surname, priceHour);
	}
	
	public static float getPetrol() {
		return petrol;
	}

	public static void setPetrol(float petrol) {
		OfficeEmployee.petrol = petrol;
	}

	@Override
	public String calculateSalary(int hoursWorked) {
		float salary = ((hoursWorked * super.getPriceHour()) + OfficeEmployee.getPetrol());
		return "El seu sou mensual és de " + salary + "."; 
	}

	@Override
	public String toString() {
		return "El/la treballador/a presencial " + super.getName() + " " + super.getSurname() + " cobra " + super.getPriceHour() 
		+ "€ l'hora amb un sumplement de " + OfficeEmployee.petrol + "€ per la gasolina.";
		
	}
	
}
