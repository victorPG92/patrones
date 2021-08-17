package patronesnuevo.factories.abstractfactory.simple;

import patronesnuevo.factories.A;
import patronesnuevo.factories.AImpl2;
import patronesnuevo.factories.B;
import patronesnuevo.factories.BImpl2;

public class FactImpl2 implements FactObjectos
{

	@Override
	public A creaA()
	{
		return new AImpl2();
	}

	@Override
	public B creaB()
	{
		return new BImpl2();
	}

	
}
