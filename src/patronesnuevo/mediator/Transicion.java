package patronesnuevo.mediator;

public class Transicion
{
	TipoTransicion tipo;
	int avance;
	
	
	public Transicion(TipoTransicion tipo)
	{
		super();
		this.tipo = tipo;
	}
	
	public Transicion()
	{
		super();
	}

	public TipoTransicion getTipo()
	{
		return tipo;
	}
	public void setTipo(TipoTransicion tipo)
	{
		this.tipo = tipo;
	}
	public int getAvance()
	{
		return avance;
	}
	public void setAvance(int avance)
	{
		this.avance = avance;
	}
	
	
	
}
