package generadorDtos.prueba;

import java.lang.reflect.InvocationTargetException;

import generadorDtos.dtos.DTO;
import generadorDtos.generadores.GeneradorRellenadorDTOReflexion;

public class PruebaRellenador {

	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException {
		GeneradorRellenadorDTOReflexion g = new GeneradorRellenadorDTOReflexion();
		DTO obj = g.generaRellenador(DTO.class);
		System.out.println(obj);
	}
	
}
