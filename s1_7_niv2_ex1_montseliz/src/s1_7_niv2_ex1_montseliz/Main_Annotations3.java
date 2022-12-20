package s1_7_niv2_ex1_montseliz;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main_Annotations3 {

	public static void main(String[] args) {
		
		Person person1 = new Person("Montse", "Liz", 30);
		
		serializePersons(person1);
		
	}
	
	public static void serializePersons(Person person1) {
		Person_Annotation annotation = person1.getClass().getAnnotation(Person_Annotation.class);
		String path = annotation.path();
		try {
			ObjectOutputStream exit = new ObjectOutputStream(new FileOutputStream (path));
			exit.writeObject(person1);
			exit.close();
			System.out.println("S'ha serialitzat correctament.");
		} catch (Exception e){
			e.printStackTrace();
		}
	}

}


