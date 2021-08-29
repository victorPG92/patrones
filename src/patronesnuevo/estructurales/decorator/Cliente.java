package patronesnuevo.estructurales.decorator;

public class Cliente
{

	public void actua()
	{
		
		InterfazBase base= new HijaBase();
		InterfazBase decorada= new DecoradorImpl(base);
		
		decorada.f();
		
	}
}
