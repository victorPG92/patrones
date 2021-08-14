package patronesnuevo.chainresponsability.segundoejemplo;

public class FactMaquinaFases
{

	public static FaseProduccion getFases()
	{
		FaseProduccion fase= new FaseArranqueEnergia();
		fase.insertaValidador(new FaseEnfriamiento());
		fase.insertaValidador(new FasePresion());
		
		return fase;
		
	}
}
