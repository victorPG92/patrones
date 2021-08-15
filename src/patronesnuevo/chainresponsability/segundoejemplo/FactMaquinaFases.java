package patronesnuevo.chainresponsability.segundoejemplo;

import java.util.ArrayList;
import java.util.List;

public class FactMaquinaFases
{

	public static FaseProduccion getFases()
	{
		FaseProduccion fase= new FaseArranqueEnergia();
		fase.insertaValidador(new FaseEnfriamiento());
		fase.insertaValidador(new FasePresion());
		
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
		
		fase.insertaValidador(faseEnf);
		fase.insertaValidador(fasePres);
		
		lista.add(fase);
		lista.add(faseEnf);
		lista.add(fasePres);
		
		return lista;
		
	}
}
