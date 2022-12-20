package s1_7_niv2_ex1_montseliz;

import java.io.Serializable;

@Person_Annotation (path = "C:\\Users\\Usuario\\eclipse-workspace_s1\\s1_7_niv2_ex1_montseliz\\src\\s1_7_niv2_ex1_montseliz\\fitxer.json")
public class Person implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String surname;
	private int age; 

	public Person (String name, String surname, int age) {
		this.name = name; 
		this.surname = surname; 
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "La persona es diu " + this.name + " " + this.surname + " i té " + this.age + " anys. ";
	}

}
