package patronesnuevo.comportamiento.observer;

public interface Observable
{

	public void insertaObservador(ObserverTime obs);
	
	public void notificaTodos();
	
	
	public void notificaTodos(EventoNotificado e, Object param);
}
