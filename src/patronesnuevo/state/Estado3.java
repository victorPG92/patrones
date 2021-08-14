package patronesnuevo.state;


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
	public Estado avanzaEstado(Transicion transicion)
	{
		if(TipoTransicion.avanza.equals(transicion.getTipo()))
		{
			return new Estado1(obj);
		}
		else if(TipoTransicion.retrocede.equals(transicion.getTipo()))
		{
			return new Estado2(obj);
		}
		else
			return null;
		
		
			
	}

	

	
}

