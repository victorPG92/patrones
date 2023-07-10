package patronesnuevo.creacionales.factories.factoryMethod;

import patronesnuevo.creacionales.factories.A;
import patronesnuevo.creacionales.factories.AImpl2;

public class FactoryMethodA2 implements FactoryMethod
{

	@Override
	public A creaA()
	{
		return new AImpl2();
	}

}
