package patronesnuevo.creacionales.factories.abstractfactory;

import patronesnuevo.creacionales.factories.A;
import patronesnuevo.creacionales.factories.AImpl2;
import patronesnuevo.creacionales.factories.B;
import patronesnuevo.creacionales.factories.BImpl2;

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
