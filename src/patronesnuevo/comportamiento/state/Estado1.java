package patronesnuevo.comportamiento.state;

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
	public Estado avanzaEstado(Transicion transicion)
	{
		
		if(TipoTransicion.avanza.equals(transicion.getTipo()))
		{
			return new Estado2(obj);
		}
		else if(TipoTransicion.retrocede.equals(transicion.getTipo()))
		{
			return new Estado3(obj);
		}
		else
			return null;
		
		
			
	}

	

	
}
