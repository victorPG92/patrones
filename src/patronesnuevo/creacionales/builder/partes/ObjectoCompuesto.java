package patronesnuevo.creacionales.builder.partes;

public abstract class ObjectoCompuesto
{

	protected ParteA parteA;
	protected ParteB parteB;
	
	
	public abstract void c();
	
	public ParteA getParteA()
	{
		return parteA;
	}
	public void setParteA(ParteA parteA)
	{
		this.parteA = parteA;
	}
	public ParteB getParteB()
	{
		return parteB;
	}
	public void setParteB(ParteB parteB)
	{
		this.parteB = parteB;
	}
	
	
}
