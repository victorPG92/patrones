package patronesnuevo.otros.mvc.vistas;

import patronesnuevo.otros.mvc.controller.Controlador;

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
