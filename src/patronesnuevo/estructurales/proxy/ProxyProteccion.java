package patronesnuevo.estructurales.proxy;

public class ProxyProteccion extends ProxyObjetoPesado
{

	public ProxyProteccion(InterfazPesada objeto)
	{
		super(objeto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void inicializaPesado()
	{
		objeto.inicializaPesado();		
	}

	@Override
	public void f(int i)
	{

		if(i>0)// protege, deberian ser credenciales pero con entero se entiende 
			objeto.f(i)	;
	}

}
