package patronesnuevo.comportamiento.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ObservableAbstr2 implements Observable
{
	
	private List<ObserverTime> observadores =new ArrayList<>();
	


	@Override
	public void insertaObservador(ObserverTime obs)
	{
		observadores.add(obs);		
	}

	@Override
	public void notificaTodos()
	{
		observadores.forEach(o -> o.notifica(EventoNotificado.aumenta_tiempo, null));		
	}
	
	public void suscribeObservador(ObserverTime obs)
	{
		insertaObservador(obs);
	}
	
	
	
	@Override
	public void notificaTodos(EventoNotificado e, Object param)
	{
		observadores.forEach(o -> o.notifica(e, param));		

		
	}


}
