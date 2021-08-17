package patronesnuevo.creacionales.protoype;

public class Clonado implements Clonable<Clonado>
{
	
	public Clonado()
	{
		
	}
	
	public Clonado(Clonado clonado)
	{
		//setea propiedades
	}

	@Override
	public Clonado clonar()
	{
		return new Clonado(this);
	}
}
