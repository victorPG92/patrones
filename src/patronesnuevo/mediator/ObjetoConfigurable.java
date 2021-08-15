package patronesnuevo.mediator;



public class ObjetoConfigurable
{

	//objet
	//private String texto;
	private int cont;
	
	//private Estado estado;// = new Estado1();
	
	MaquinaEstados maquinaEstados;
	
	public static ObjetoConfigurable creaObjetoConEstado()
	{
		ObjetoConfigurable obj= new ObjetoConfigurable();
		MaquinaEstados maquinaEstados= new MaquinaEstados(obj);
		//maquinaEstados.setObj(obj);
		obj.setMaquinaEstados(maquinaEstados);
		
		return obj;
		
	}

	public void mostrarMensaje()
	{
		System.out.println(maquinaEstados.getEstadoActual().texto);
		//System.out.println(estado.texto);
	}
	
	public void mostrarContador()
	{
		System.out.println(cont);
	}
	
	public void avanza()
	{
		maquinaEstados.avanzaEstadoPublico(new Transicion(TipoTransicion.avanza));
	}
	
	public void retrocede()
	{
		maquinaEstados.avanzaEstadoPublico(new Transicion(TipoTransicion.retrocede));
	}
	
	public void actua()
	{
		maquinaEstados.getEstadoActual().actuaObjeto();
	}
	



	public Estado getEstado()
	{
		return maquinaEstados.getEstadoActual();
	}	

	public int getCont()
	{
		return cont;
	}
	public void setCont(int cont)
	{
		this.cont = cont;
	}

	public MaquinaEstados getMaquinaEstados()
	{
		return maquinaEstados;
	}

	public void setMaquinaEstados(MaquinaEstados maquinaEstados)
	{
		this.maquinaEstados = maquinaEstados;
	}


	
}
