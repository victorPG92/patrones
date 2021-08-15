package patronesnuevo.chainresponsability.segundoejemplo;

/**
 * Maquina que se somete a unas fases
 * y posee temperatura, presion y energia
 * que seran modificadas y consultadas en las diferentes fases
 * @author victor
 *
 */
public class MaquinaElectrica
{

	private int temperatura;
	private int presion;
	private int energiaMinima;
	
	public MaquinaElectrica(int temperatura, int presion, int energiaMinima)
	{
		super();
		this.temperatura = temperatura;
		this.presion = presion;
		this.energiaMinima = energiaMinima;
	}

	public int getTemperatura()
	{
		return temperatura;
	}

	public void setTemperatura(int temperatura)
	{
		this.temperatura = temperatura;
	}

	public int getPresion()
	{
		return presion;
	}

	public void setPresion(int presion)
	{
		this.presion = presion;
	}

	public int getEnergiaMinima()
	{
		return energiaMinima;
	}

	public void setEnergiaMinima(int energiaMinima)
	{
		this.energiaMinima = energiaMinima;
	}
	
	
	
	
}
