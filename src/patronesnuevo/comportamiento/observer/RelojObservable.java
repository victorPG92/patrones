package patronesnuevo.comportamiento.observer;

import java.util.Calendar;
import java.util.Date;

public class RelojObservable extends ObservableAbstr
{
	
	Date d= new Date();
	
	public void pasa1Seg()
	{
		Calendar c= Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.SECOND, 1);
		
		d= c.getTime();
		
		notificaTodos(EventoNotificado.aumenta_tiempo, null);
	}

	@Override
	public String toString()
	{
		return "RelojObservable [d=" + d + "]";
	}
	
	
	
	
	

}
