package generadorDtos.generadores;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.stream.Stream;

import generadorDtos.generadores.comprobaciones.Comprobador;
import generadorDtos.generadores.rellenadores.Rellenador;

public class GeneradorRellenadroDTO {

	Comprobador comprobador = new Comprobador();
	Rellenador rellenador= new Rellenador();
	
	public <T> T generaRellenador(Class<T> clase) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
		T obj = clase.newInstance();
		
		System.out.println("nuevo objeto "+ obj);
		
		 Stream<Field> camposInstanciables = Arrays.stream(clase.getDeclaredFields())
	            .filter(field -> !Modifier.isStatic(field.getModifiers())) 
	            .filter(field -> !field.getType().isPrimitive() && !field.getType().isInterface()
	            		&& !Modifier.isAbstract(field.getType().getModifiers())) ;

		
		for(Field field: clase.getDeclaredFields())
		{
			System.out.println("field "+field.toString());
			if(comprobador.esTipoPrimitivo(field))
			{
				System.out.println("field es primitivo "+ field.getType());
				Object valorASignado= rellenador.rellenaTipoPrimitivo(field);
				String nombreSetter= "set"+Util.capitalize(field.getName());
				
				System.out.println("field es primitivo nombreSetter"+ nombreSetter);
				System.out.println("field es primitivo valorASignado"+ valorASignado);

				obj.getClass().getDeclaredMethod(nombreSetter, field.getType()).invoke(obj,valorASignado );
			}
			else
			{
				System.err.println(field.getType());
			//	generaRellenador(field.getDeclaringClass());
			}
			
		}
		
		return obj;
	}
	
	

	
	

}
