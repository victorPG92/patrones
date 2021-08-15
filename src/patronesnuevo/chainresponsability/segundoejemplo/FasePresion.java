package patronesnuevo.chainresponsability.segundoejemplo;

/**
 * Se ejecuta, siempre, modifica la presion
 * continua siempre
 * 
 * @author victor
 *
 */
public class FasePresion extends FaseProduccion
{

	@Override
	protected boolean debeActuar(MaquinaElectrica maq)
	{
		return true;
	}

	@Override
	protected void actua(MaquinaElectrica maq)
	{
		 maq.setPresion((int)(maq.getPresion()*0.9));

	}

	@Override
	protected boolean debeSeguir(MaquinaElectrica maq)
	{
		return true;
	}
	
	@Override
	public String toString()
	{
		return "fase presion";
	}


}
