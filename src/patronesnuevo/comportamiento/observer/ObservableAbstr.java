package patronesnuevo.comportamiento.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ObservableAbstr implements Observable
{
	
	private List<ObserverTime> observadores =new ArrayList<>();
	
	Map<EventoNotificado,List<ObserverTime>> observadoresEnEvento= new HashMap<>();


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
	
	public void suscribeObservadorEvento(ObserverTime obs, EventoNotificado ev)
	{
		List<ObserverTime> list = observadoresEnEvento.get(ev);
		if(list==null)
		{
			list= new ArrayList<>();
			observadoresEnEvento.put(ev, list);
		}
		
		list.add(obs);
	}
	
	@Override
	public void notificaTodos(EventoNotificado e, Object param)
	{
		List<ObserverTime> list = observadoresEnEvento.get(e);
		
		if(list!=null)
		{
			for (ObserverTime observerTime : list)
			{
				observerTime.notifica(e, param);
			}
			
		}
		
	}


}
