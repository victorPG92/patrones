package patronesnuevo.comportamiento.mediator;


public class Estado3 extends Estado
{
	

	public Estado3(ObjetoConfigurable obj)
	{
		super(obj);
	}

	@Override
	public void configuraObjeto()
	{
		texto=" estoy en el estado 3";
	}
	
	@Override
	public void actuaObjeto()
	{
		obj.mostrarMensaje();
		obj.mostrarContador();
		
	}

	@Override
	public void actuaTransicionObjeto(Transicion transicion)
	{
		// TODO Auto-generated method stub
		
	}

	
	

	
}

