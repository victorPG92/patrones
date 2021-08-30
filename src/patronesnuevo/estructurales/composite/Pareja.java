package patronesnuevo.estructurales.composite;

public class Pareja implements Elemento
{

	ElementoSimple elem1;
	ElementoSimple elem2;
	
	
	
	public Pareja(ElementoSimple elem1, ElementoSimple elem2)
	{
		super();
		this.elem1 = elem1;
		this.elem2 = elem2;
	}



	public ElementoSimple getElem1()
	{
		return elem1;
	}



	public void setElem1(ElementoSimple elem1)
	{
		this.elem1 = elem1;
	}



	public ElementoSimple getElem2()
	{
		return elem2;
	}



	public void setElem2(ElementoSimple elem2)
	{
		this.elem2 = elem2;
	}



	@Override
	public double calculaPrecio()
	{
		return elem1.calculaPrecio() + elem2.calculaPrecio();
	}
	
	
	
}
