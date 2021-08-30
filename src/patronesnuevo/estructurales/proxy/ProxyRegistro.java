package patronesnuevo.estructurales.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyRegistro  extends ProxyObjetoPesado implements InterfazPesada
{

	private List<Integer> registro= new ArrayList<>();
	public ProxyRegistro(InterfazPesada objeto)
	{
		super(objeto);
	}

	@Override
	public void inicializaPesado()
	{
		System.out.println("inicializa como el objeto envuelto");
		objeto.inicializaPesado();
	}

	@Override
	public void f(int i)
	{
	
		objeto.f(i);
		registro.add(i); 
	}

}
