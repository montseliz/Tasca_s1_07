package s1_7_niv1_ex1_montseliz;

public class OnlineEmployee extends Employee{
	
	private final float PRICE_INTERNET; 
	
	public OnlineEmployee(String name, String surname, int priceHour) {
		super(name, surname, priceHour);
		this.PRICE_INTERNET = 50.5f;
	}
	
	public float getPRICE_INTERNET() {
		return PRICE_INTERNET;
	}
	
	@Override
	public String calculateSalary(int hoursWorked) {
		float salary = ((hoursWorked * super.getPriceHour()) + this.getPRICE_INTERNET());
		return "El seu sou mensual és de " + salary + "."; 
	}

	@Override
	public String toString() {
		return "El/la treballador/a online " + super.getName() + " " + super.getSurname() + " cobra " + super.getPriceHour() 
		+ "€ l'hora amb un sumplement de " + this.PRICE_INTERNET + "€ per la tarifa plana d'internet.";
		
	}



	
}
