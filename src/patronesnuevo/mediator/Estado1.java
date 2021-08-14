package patronesnuevo.mediator;

public class Estado1 extends Estado
{
	public Estado1()
	{
		super();
		configuraObjeto();
		//se puede hacer en el constructor
	}

	public Estado1(ObjetoConfigurable obj)
	{
		super(obj);
	}

	@Override
	public void configuraObjeto()
	{
		texto=" estoy en el estado 1";
	}
	
	@Override
	public void actuaObjeto()
	{
		obj.mostrarMensaje();
		
	}

	@Override
	public void actuaTransicionObjeto(Transicion transicion)
	{
		
	}

	

	

	
}
