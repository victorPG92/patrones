package patronesnuevo.estructurales.proxy;

/**
 * ProxyInicializacionDiferida
 * @author victor
 *
 */
public class ProxyVirtual  extends ProxyObjetoPesado implements InterfazPesada
{

	private boolean inicializado=false;
	public ProxyVirtual(InterfazPesada objeto)
	{
		super(objeto);
	}

	@Override
	public void inicializaPesado()
	{
		System.out.println("No hace nada");
		
	}

	@Override
	public void f(int i)
	{

		if(!inicializado) 
		{
			objeto.inicializaPesado();
			inicializado=true;
		}
		
		objeto.f(i);
	}

}
