package patronesnuevo.factories.abstractfactory.simple;

import patronesnuevo.factories.A;
import patronesnuevo.factories.AImpl;
import patronesnuevo.factories.B;
import patronesnuevo.factories.BImpl;

public class FactImpl implements FactObjectos
{

	@Override
	public A creaA()
	{
		return new AImpl();
	}

	@Override
	public B creaB()
	{
		return new BImpl();
	}

	
}
