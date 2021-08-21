package patronesnuevo.comportamiento.state;

public abstract class Estado
{
	
	protected ObjetoConfigurable obj; //objeto del que es estado
	
	protected String texto; //valor fijo que depende del estado, es la configuracion
	
	

	public Estado(ObjetoConfigurable obj)
	{
		super();
		this.obj = obj;
	}
	public Estado()
	{
		super();
	}

	/**
	 * Al entrar en este estado, configura el objeto , en este caso, el texto
	 * se puede hacer en el constructor, si se repite
	 */
	public abstract void configuraObjeto();
	
	
	/**
	 * El comportamiento del objeto en este estado
	 */
	public abstract void actuaObjeto();
	
	
	/**
	 * Cambia de estado, realizando algo mas
	 * @param transicion
	 */
	public  Estado avanzaEstadoPublico(Transicion transicion) 
	{
		Estado estadoNuevo= avanzaEstado(transicion);
		System.out.println("estado nuevo "+ estadoNuevo);
		estadoNuevo.configuraObjeto();
		obj.setEstado(estadoNuevo);
		//estadoNuevo.actuaObjeto();//puede ser y no 
		
		return estadoNuevo;
	}
	
	
	/**
	 * Cambia de estado, realizando algo mas
	 * @param transicion
	 */
	protected abstract Estado avanzaEstado(Transicion transicion);

	public ObjetoConfigurable getObj()
	{
		return obj;
	}

	public void setObj(ObjetoConfigurable obj)
	{
		this.obj = obj;
	}

	public String getTexto()
	{
		return texto;
	}

	
	
	
	
}
