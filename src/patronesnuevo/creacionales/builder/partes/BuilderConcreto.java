package patronesnuevo.creacionales.builder.partes;

public class BuilderConcreto implements BuilderObjetoCompuesto
{

	private ObjectoCompuesto obj;

	@Override
	public void inicializaObj()
	{
		obj= new ObjetoCompuestoImpl();
		
	}

	@Override
	public void creaParteA()
	{
		obj.setParteA(new ParteAImpl());
		
	}

	@Override
	public void creaParteB()
	{
		obj.setParteB(new ParteBImpl());
		
	}
	
	

	@Override
	public ObjectoCompuesto getRtdo()
	{
		return obj;
	}
	
}
