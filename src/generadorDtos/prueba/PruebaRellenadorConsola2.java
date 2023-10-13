package generadorDtos.prueba;

import java.lang.reflect.InvocationTargetException;

import generadorDtos.dtos.Padre;
import generadorDtos.generadores.GeneradorRellenadorCodigoDTO;

public class PruebaRellenadorConsola2 {

	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException {
		GeneradorRellenadorCodigoDTO g = new GeneradorRellenadorCodigoDTO();
		 g.generaRellenador(Padre.class);
	}
	
}
