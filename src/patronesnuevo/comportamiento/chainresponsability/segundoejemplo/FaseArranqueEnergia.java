package patronesnuevo.comportamiento.chainresponsability.segundoejemplo;

/**
 * Fasede arranque que necesitra energia
 * Si tiene suficiente, se ejecuta
 * si aun tiene suficiente despues de ejecutar, continua
 * 
 * @author victor
 *
 */
public class FaseArranqueEnergia extends FaseProduccion
{

	private int energiaNecesariaArrancar=1000;
	private int energiaNecesariaSeguir=500;
	

	private boolean debeSeguir;
	
	@Override
	protected boolean debeActuar(MaquinaElectrica maq)
	{
		debeSeguir=maq.getEnergiaMinima()>energiaNecesariaArrancar;;
		return debeSeguir;
	}

	@Override
	protected void actua(MaquinaElectrica maq)
	{
		System.out.println("arrancando maquina");
		maq.setEnergiaMinima(maq.getEnergiaMinima()-energiaNecesariaArrancar);

	}

	@Override
	protected boolean debeSeguir(MaquinaElectrica maq)
	{
		
		
		return debeSeguir&& maq.getEnergiaMinima()>energiaNecesariaSeguir;

	}
	
	@Override
	public String toString()
	{
		return "fase arranque";
	}

}
