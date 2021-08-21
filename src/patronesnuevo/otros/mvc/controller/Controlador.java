package patronesnuevo.otros.mvc.controller;

public abstract class Controlador
{

	private static Controlador contr = new ControllerImpl();
	
	//private Controlador() {}
	
	public static Controlador getInst()
	{
		return contr;
	}
	
	public void manejaEvento(String evento, int valor)
	{
		
	}
}
