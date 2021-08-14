package patronesnuevo.chainresponsability.segundoejemplo;

public class FaseEnfriamiento extends FaseProduccion
{

	private int tempMax=100;
	
	@Override
	protected boolean debeActuar(MaquinaElectrica maq)
	{
		System.out.println("temperatura "+maq.getTemperatura()+"> "+tempMax );
		return maq.getTemperatura()>tempMax;
	}

	@Override
	protected void actua(MaquinaElectrica maq)
	{
		System.out.println("Enfriando y poniendo temp a " +tempMax);
		 maq.setTemperatura(tempMax);

	}

	@Override
	protected boolean debeSeguir(MaquinaElectrica maq)
	{
		return true;
	}
	
	@Override
	public String toString()
	{
		return "fase enfriamiento";
	}


}
