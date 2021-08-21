package patronesnuevo.otros.mvc.controller;

import patronesnuevo.otros.mvc.vistas.View;

public class ControllerImpl extends Controlador
{
	View view;

	public ControllerImpl () {}
	
	public void manejaEvento(String evento, int valor)
	{
		view.actualizaCampo(valor);
	}
}
