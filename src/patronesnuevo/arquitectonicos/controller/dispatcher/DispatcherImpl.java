package patronesnuevo.arquitectonicos.controller.dispatcher;

import patronesnuevo.arquitectonicos.controller.Evento;
import patronesnuevo.arquitectonicos.controller.Resultado;

public class DispatcherImpl implements Dispatcher
{

	@Override
	public Resultado despachador(Evento evento, Resultado rtdo)
	{
		return rtdo;
	}

}
