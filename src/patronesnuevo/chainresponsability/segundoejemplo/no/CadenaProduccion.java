package patronesnuevo.chainresponsability.segundoejemplo.no;

import java.util.LinkedList;
import java.util.List;

import patronesnuevo.comportamiento.chainresponsability.segundoejemplo.FaseProduccion;

/**
 * No es una cadena de responsabilidad, porque no  usa refl, recursion
 * pero maneja las fases
 * 
 * @author victor
 *
 */
public class CadenaProduccion
{

	List<FaseProduccion> fases= new LinkedList<>();
	
}
