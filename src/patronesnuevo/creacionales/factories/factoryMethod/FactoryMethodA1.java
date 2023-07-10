package patronesnuevo.creacionales.factories.factoryMethod;

import patronesnuevo.creacionales.factories.A;
import patronesnuevo.creacionales.factories.AImpl;

public class FactoryMethodA1 implements FactoryMethod
{

	@Override
	public A creaA()
	{
		return new AImpl();
	}

}
