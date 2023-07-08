package patronesnuevo.comportamiento.chainresponsability.simple;

public abstract class VerdaderaCadena
{

	private  VerdaderaCadena sig;
	
	public abstract boolean debePasarAlSiguiente();
	
	
	public void actuar(SolicitudCop solicitud)
	{
		if(debePasarAlSiguiente() && sig!=null )
		{
			sig.actuar(solicitud);
		}
		else
			acabaAccion(solicitud);
	}
	
	
	public abstract void acabaAccion(SolicitudCop solicitud);
	
	
}
