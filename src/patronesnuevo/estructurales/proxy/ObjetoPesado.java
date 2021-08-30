package patronesnuevo.estructurales.proxy;

public class ObjetoPesado implements InterfazPesada
{

	@Override
	public void inicializaPesado()
	{
		System.out.println("Procedimiento pesado que tarda mucho");
		
	}

	@Override
	public void f(int i)
	{
		System.out.println(Integer.toString(i));
	}

}
