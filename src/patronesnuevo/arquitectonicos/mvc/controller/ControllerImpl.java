package patronesnuevo.arquitectonicos.mvc.controller;

import patronesnuevo.arquitectonicos.mvc.vistas.View;

public class ControllerImpl extends Controlador
{
	View view;

	public ControllerImpl () {}
	
	public void manejaEvento(String evento, int valor)
	{
		view.actualizaCampo(valor);
	}
}
