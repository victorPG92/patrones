package patronesnuevo.state;

public class ObjetoConfigurable
{

	//objet
	//private String texto;
	private int cont;
	
	private Estado estado;// = new Estado1();
	

	public void mostrarMensaje()
	{
		System.out.println(estado.texto);
	}
	
	public void mostrarContador()
	{
		System.out.println(cont);
	}
	
	public void avanza()
	{
		estado.avanzaEstadoPublico(new Transicion(TipoTransicion.avanza));
	}
	
	public void retrocede()
	{
		estado.avanzaEstadoPublico(new Transicion(TipoTransicion.retrocede));
	}
	
	public void actua()
	{
		estado.actuaObjeto();
	}
	



	public Estado getEstado()
	{
		return estado;
	}

	public void setEstado(Estado estado)
	{
		this.estado = estado;
		estado.setObj(this);
	}

	public int getCont()
	{
		return cont;
	}
	public void setCont(int cont)
	{
		this.cont = cont;
	}


	
}
