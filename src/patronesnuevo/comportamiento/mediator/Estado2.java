package patronesnuevo.comportamiento.mediator;


public class Estado2 extends Estado
{
	

	public Estado2(ObjetoConfigurable obj)
	{
		super(obj);
	}

	@Override
	public void configuraObjeto()
	{
		texto=" estoy en el estado 2";
	}
	
	@Override
	public void actuaObjeto()
	{
		obj.mostrarContador();
		
	}

	@Override
	public void actuaTransicionObjeto(Transicion transicion)
	{
		// TODO Auto-generated method stub
		
	}

	
	

	
}

