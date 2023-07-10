package patronesnuevo.comportamiento.chainresponsability.simple;

public abstract class VerdaderaCadena<T>
{

	private  VerdaderaCadena<T> sig;
	
	protected abstract boolean debePasarAlSiguiente();
	
	
	public void actuar(T solicitud)
	{
		if(debePasarAlSiguiente() && sig!=null )
		{
			sig.actuar(solicitud);
		}
		else
			acabaAccion(solicitud);
	}
	
	
	protected abstract void acabaAccion(T solicitud);
	
	
}
