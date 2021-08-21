package patronesnuevo.estructurales.adapter;

public class Adaptador implements  InterfazRequerida
{

	private ClaseExistente antigua;

	@Override
	public void metodoNecesario()
	{
		antigua.metodoCreado();
		
	}
	
	
}
