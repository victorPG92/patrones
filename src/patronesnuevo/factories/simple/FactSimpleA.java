package patronesnuevo.factories.simple;

import patronesnuevo.factories.A;
import patronesnuevo.factories.AImpl;
import patronesnuevo.factories.AImpl2;

/**
 * En este caso solicito, un objeto tipo A, y le digo el tipo que quiero
 * @author victor
 *
 */
public class FactSimpleA
{

	/**
	 * En 
	 * @param tipo
	 * @return
	 */
	public A creaASegunTipo(String tipo,Object params)
	{
		
		if(tipo.equals("2"))
			return new AImpl2();
		else
			return new AImpl();
	}
}
