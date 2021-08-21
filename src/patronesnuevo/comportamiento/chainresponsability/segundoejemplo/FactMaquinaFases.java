package patronesnuevo.comportamiento.chainresponsability.segundoejemplo;

import java.util.ArrayList;
import java.util.List;

/**
 * Crea la chain of responsability concreta
 * @author victor
 *
 */
public class FactMaquinaFases
{

	public static FaseProduccion getFases()
	{
		FaseProduccion fase= new FaseArranqueEnergia();
		fase.insertaFase(new FaseEnfriamiento());
		fase.insertaFase(new FasePresion());
		
		return fase;
		
	}
	
	/**
	 * Devuelve estructura por si no se quiere empezar por la primera
	 * @return
	 */
	public static List<FaseProduccion> getFasesLista()
	{
		List<FaseProduccion> lista= new ArrayList<>();
		
		FaseProduccion fase= new FaseArranqueEnergia();
		FaseEnfriamiento faseEnf = new FaseEnfriamiento();
		FasePresion fasePres = new FasePresion();
		
		fase.insertaFase(faseEnf);
		fase.insertaFase(fasePres);
		
		lista.add(fase);
		lista.add(faseEnf);
		lista.add(fasePres);
		
		return lista;
		
	}
}
