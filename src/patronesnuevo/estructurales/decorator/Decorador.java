package patronesnuevo.estructurales.decorator;

public abstract class Decorador implements InterfazBase
{

	InterfazBase base;

	
	
	
	public Decorador(InterfazBase base)
	{
		super();
		this.base = base;
	}

	/**
	 * Implementacion en el caso de que siempre se quiera realizar algo antes de la hija
	 */
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
