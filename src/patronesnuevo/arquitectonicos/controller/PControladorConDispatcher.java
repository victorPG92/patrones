package patronesnuevo.arquitectonicos.controller;

import patronesnuevo.arquitectonicos.controller.datos.Datos;
import patronesnuevo.arquitectonicos.controller.dispatcher.Dispatcher;

public class PControladorConDispatcher implements PControlador
{
	Dispatcher disp;

	@Override
	public Resultado maneja(Evento evento, Datos datos)
	{
		
		Resultado rtdo = new Resultado();
		
		// manda a modelo
		
		//devuelve a ventana
		Resultado rtdo2 = disp.despachador(Evento.eventoResultadoAlta, rtdo);
		
		return rtdo2;
	}

	
}
