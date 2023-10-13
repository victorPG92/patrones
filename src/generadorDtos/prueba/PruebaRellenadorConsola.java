package generadorDtos.prueba;

import java.lang.reflect.InvocationTargetException;

import generadorDtos.dtos.DTO;
import generadorDtos.generadores.GeneradorRellenadorDTO;

public class PruebaRellenadorConsola {

	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException {
		GeneradorRellenadorDTO g = new GeneradorRellenadorDTO();
		 g.generaRellenador(DTO.class);
	}
	
}
