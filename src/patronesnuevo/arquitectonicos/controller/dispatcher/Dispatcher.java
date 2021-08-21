package patronesnuevo.arquitectonicos.controller.dispatcher;

import patronesnuevo.arquitectonicos.controller.Evento;
import patronesnuevo.arquitectonicos.controller.Resultado;

public interface Dispatcher
{

	public Resultado despachador(Evento evento, Resultado rtdo);
}
