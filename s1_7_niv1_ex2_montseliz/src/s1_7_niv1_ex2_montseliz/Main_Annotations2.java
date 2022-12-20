package s1_7_niv1_ex2_montseliz;

import java.util.ArrayList;

public class Main_Annotations2 {

	@SuppressWarnings ("deprecation")
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("Marc", "González", 40);
		System.out.println(employee.toString());
		System.out.println(employee.calculateSalary(30));
		
		OfficeEmployee.setPetrol(40.5f);
		
		ArrayList <Employee> listEmployees = new ArrayList <Employee>(); 
		listEmployees.add(new OfficeEmployee("Marta", "Torres", 35));
		listEmployees.add(new OfficeEmployee("Martí", "Bertran", 30));
		listEmployees.add(new OnlineEmployee("Alex", "Badia", 40));
		listEmployees.add(new OnlineEmployee("Paula", "García", 45));
		
		System.out.println(listEmployees.get(1).toString());
		System.out.println(listEmployees.get(1).calculateSalary(160));
		
		System.out.println(listEmployees.get(3).toString());
		System.out.println(listEmployees.get(3).calculateSalary(80)); 
		
		System.out.println("");
		
		OfficeEmployee officeEmployee = new OfficeEmployee("Carla", "Simon", 40);
		System.out.println(officeEmployee.toString());
		System.out.println(officeEmployee.calculateHolidays(365));
		
		OnlineEmployee onlineEmployee = new OnlineEmployee("Carles", "Costa", 30);
		System.out.println(onlineEmployee.toString());
		System.out.println(onlineEmployee.calculateHolidays(365));
		

	}

}
