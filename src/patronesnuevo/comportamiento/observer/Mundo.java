package patronesnuevo.comportamiento.observer;

public class Mundo
{

	private ObservadorCrecer crecido= new ObservadorCrecer();
	private RelojObservable reloj= new RelojObservable();
	
	public Mundo()
	{
		reloj.suscribeObservadorEvento(crecido, EventoNotificado.aumenta_tiempo);
	}
	
	
	public void evolucionaMundo()
	{
		for (int i = 0; i < 3; i++)
		{
			reloj.pasa1Seg();
		}
		System.out.println(reloj);
		System.out.println(crecido);
	}
	
	public static void main(String[] args)
	{
		Mundo m= new Mundo();
		
		m.evolucionaMundo();
	}
}
