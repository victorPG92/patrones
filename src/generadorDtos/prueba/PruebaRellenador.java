package generadorDtos.prueba;

import java.lang.reflect.InvocationTargetException;

import generadorDtos.dtos.DTO;
import generadorDtos.generadores.GeneradorRellenadroDTO;

public class PruebaRellenador {

	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException {
		GeneradorRellenadroDTO g = new GeneradorRellenadroDTO();
		DTO obj = g.generaRellenador(DTO.class);
		System.out.println(obj);
	}
	
}
