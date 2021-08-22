package patronesnuevo.estructurales.decorator;

public abstract class Decorador implements InterfazBase
{

	InterfazBase base;

	@Override
	public void f()
	{
		decoraF();
		base.f();
		
	}
	
	/**
	 * Obliga a implementar el comportamiento secundario decorado
	 */
	protected abstract void decoraF();
	
}
