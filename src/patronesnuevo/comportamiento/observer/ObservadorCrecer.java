package patronesnuevo.comportamiento.observer;

public class ObservadorCrecer implements ObserverTime
{
	private int altura=100;
	
	public void crecerDia()
	{
		altura++;
	}

	@Override
	public void notifica(EventoNotificado e, Object param)
	{
		if(EventoNotificado.aumenta_tiempo.equals(e))
			crecerDia();
	}

	@Override
	public String toString()
	{
		return "ObservadorCrecer [altura=" + altura + "]";
	}

	
	 
}
