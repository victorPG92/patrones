package patronesnuevo.creacionales.factories.abstractfactory;

import patronesnuevo.creacionales.factories.A;
import patronesnuevo.creacionales.factories.AImpl;
import patronesnuevo.creacionales.factories.B;
import patronesnuevo.creacionales.factories.BImpl;

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
