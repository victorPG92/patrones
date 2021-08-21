package patronesnuevo.comportamiento.chainresponsability.segundoejemplo;

/**
 * Fase que sigue si no ha actuado
 * Sde usa para procesar alguna peticion por la cadena y que cuando se procesa, ya no recorra mas
 * 
 * @author victor
 *
 */
public abstract class FaseDeUnicaEjecucion  extends FaseProduccion
{

	

	

	@Override
	protected boolean debeSeguir(MaquinaElectrica maq)
	{
		return !debeActuar(maq);
	}

	
}
