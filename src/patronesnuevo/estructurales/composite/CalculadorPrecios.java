package patronesnuevo.estructurales.composite;

public class CalculadorPrecios
{

	/**
	 * No es necesario un calculador precios, puesto que se hace en composite
	 * @param elem
	 * @return
	 */
	public double calculaPrecios(Elemento elem)
	{
		return  elem.calculaPrecio();
	}
	
	public static void main(String[] args)
	{
		FactoriaCampNavidad fact= new  FactoriaCampNavidad();
		
		Elemento paquete = fact.creaPaquete();
		
		Elemento superElemento = fact.creaSuperPaquete();
		
		System.out.println(paquete.calculaPrecio());
		System.out.println(superElemento.calculaPrecio());
		
		// aunque el paquete seapaquete es tratado como elemento cualquiera para superpaquete
		((PaqueteElemento)superElemento).insertaElemento(paquete);
		
		System.out.println(superElemento.calculaPrecio());


	}
}
