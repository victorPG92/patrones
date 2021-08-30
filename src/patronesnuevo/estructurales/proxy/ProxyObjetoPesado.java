package patronesnuevo.estructurales.proxy;

public abstract class ProxyObjetoPesado implements InterfazPesada
{

	protected InterfazPesada objeto;
	

	public ProxyObjetoPesado(InterfazPesada objeto)
	{
		super();
		this.objeto = objeto;
	}

	public InterfazPesada getObjeto()
	{
		return objeto;
	}

	public void setObjeto(InterfazPesada objeto)
	{
		this.objeto = objeto;
	}
	
	
}
