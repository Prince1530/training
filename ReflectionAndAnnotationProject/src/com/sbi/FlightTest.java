package com.sbi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class FlightTest {

		public static  void main(String[] args) {
			// TODO Auto-generated method stub
			Flight theFlight = new Flight();

			Class theClass = theFlight.getClass();

			Constructor ctors[] = theClass.getConstructors();

			for (Constructor constructor : ctors) {
				System.out.println("Constructor : with "+constructor.getParameterCount()+" arguments. ");
			}

			System.out.println("---------------------");

			Field fields[] = theClass.getFields();
			for (Field field : fields) {
				System.out.println("Field is : "+field.getName());
			}
	
			System.out.println("-----------------");
	
			Annotation anno [] = theClass.getAnnotations();
	
			for (Annotation annotation : anno) {
				System.out.println("Annotation is : "+annotation);
				if(annotation instanceof DevelopedBy) {
					DevlopedBy db = (DevelopedBy) annotation;
					String developer = db.name();
					double version=db.version();
	
					if(developer.equals("vinay") && version ==1.3) {
						System.out.println("Class Flight is valid..lets run...");
					}
					else {
						System.out.println("Class Flight is invalid...lets stop...");
					}
				}
			}

	}

}