package patronesnuevo.arquitectonicos.controller;

import patronesnuevo.arquitectonicos.controller.datos.Datos;

public interface PControlador
{
 
	public Resultado maneja(Evento evento, Datos datos);
}
