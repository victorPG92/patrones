package patronesnuevo.estructurales.composite;

import java.util.ArrayList;
import java.util.List;

public class PaqueteElemento implements Elemento
{

	List<Elemento> elementos= new ArrayList<>();
	
	
	

	public void insertaElemento(Elemento elem)
	{
		elementos.add(elem);
	}


	@Override
	public double calculaPrecio()
	{
		double precio= 0.0;
		
		for (Elemento elemento : elementos)
		{
			precio+=elemento.calculaPrecio();
		}
		
		return precio;
	}
}
