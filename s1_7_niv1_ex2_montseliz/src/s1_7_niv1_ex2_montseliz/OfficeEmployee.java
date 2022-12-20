package s1_7_niv1_ex2_montseliz;

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
	/**
	 * @deprecated 
	 * Queda obsolet perquè els dies de vacances es calculen per hores treballades
	 * @param daysWorked
	 * @return String
	 */
	@Deprecated
	public String calculateHolidays(int daysWorked) {
		float holidayDays = (2.5f * daysWorked) / 30;
		return "Té " + (int) holidayDays + " dies de vacances per l'any treballat." ; 
	}

	@Override
	public String toString() {
		return "El/la treballador/a presencial " + super.getName() + " " + super.getSurname() + " cobra " + super.getPriceHour() 
		+ "€ l'hora amb un sumplement de " + OfficeEmployee.petrol + "€ per la gasolina.";
		
	}
	
}
