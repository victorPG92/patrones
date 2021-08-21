package patronesnuevo.arquitectonicos.controller;

import patronesnuevo.arquitectonicos.controller.datos.Datos;

/**
 * actua como patron mediator entre ventana y modelo
 * @author victor
 *
 */
public interface PControlador
{
 
	public Resultado maneja(Evento evento, Datos datos);
}
