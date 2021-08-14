package patronesnuevo.state;


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

