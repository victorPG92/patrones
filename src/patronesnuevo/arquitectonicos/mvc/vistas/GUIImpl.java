package patronesnuevo.arquitectonicos.mvc.vistas;

import patronesnuevo.arquitectonicos.mvc.controller.Controlador;

public class GUIImpl implements View
{

	int i;
	
	@Override
	public void generaEvento()
	{
		
		Controlador.getInst().manejaEvento("", 1);
	}

	@Override
	public void actualizaCampo(int a)
	{
		
		i=a;
	}

}
