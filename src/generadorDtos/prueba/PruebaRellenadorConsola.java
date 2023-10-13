package generadorDtos.prueba;

import java.lang.reflect.InvocationTargetException;

import generadorDtos.dtos.DTO;
import generadorDtos.generadores.GeneradorRellenadorCodigoDTO;

public class PruebaRellenadorConsola {

	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException {
		GeneradorRellenadorCodigoDTO g = new GeneradorRellenadorCodigoDTO();
		 g.generaRellenador(DTO.class);
	}
	
}
