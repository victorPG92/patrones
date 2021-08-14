package patronesnuevo.chainresponsability.segundoejemplo;

public class FasePresion extends FaseProduccion
{

	@Override
	protected boolean debeActuar(MaquinaElectrica maq)
	{
		return maq.getTemperatura()>100;
	}

	@Override
	protected void actua(MaquinaElectrica maq)
	{
		 maq.setTemperatura(100);

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
