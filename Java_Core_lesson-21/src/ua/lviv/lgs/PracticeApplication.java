package ua.lviv.lgs;

import java.lang.reflect.Field;

public class PracticeApplication {
	
	public static void main(String[] args) {
		
		practiceAnnotatedFieldsAndValues(PracticeClass.class);
		
	}
	
	public static void practiceAnnotatedFieldsAndValues(Class<?> customClass) {
		
		Field[] fields = customClass.getDeclaredFields();
		
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			
			if(field.getAnnotation(Practice.class) instanceof Practice) {
				System.out.print(field.getType() + " " + field.getName() + " ---> ");
				System.out.println("annotation type = " + field.getAnnotation(Practice.class).annotationType());
				System.out.println("annotation value = " + field.getAnnotation(Practice.class).value());
			}
		}
	}

}
