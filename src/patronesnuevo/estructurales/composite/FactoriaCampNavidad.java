package patronesnuevo.estructurales.composite;

public class FactoriaCampNavidad
{

	public Pareja creaPareja()
	{
		
		return new Pareja(new ElementoSimple("uno", 1.0),new ElementoSimple("dos", 1.0));
		
	}
	
	public PaqueteElemento creaPaquete()
	{
		PaqueteElemento paquete= new PaqueteElemento();
		
		paquete.insertaElemento(creaPareja());
		paquete.insertaElemento(new ElementoSimple("regalo", 2.0));

		return paquete;
		
	}
	public PaqueteElemento creaSuperPaquete()
	{
		PaqueteElemento paquete= new PaqueteElemento();
		
		paquete.insertaElemento(creaPaquete());
		paquete.insertaElemento(
				new ElementoCompuesto(new ElementoSimple("regalo", 2.0),creaPareja()) );

		return paquete;
		
	}
}
