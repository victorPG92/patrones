package generadorDtos.prueba;

import java.lang.reflect.InvocationTargetException;

import generadorDtos.dtos.Padre;
import generadorDtos.generadores.GeneradorRellenadorDTO;

public class PruebaRellenadorConsola2 {

	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException {
		GeneradorRellenadorDTO g = new GeneradorRellenadorDTO();
		 g.generaRellenador(Padre.class);
	}
	
}
