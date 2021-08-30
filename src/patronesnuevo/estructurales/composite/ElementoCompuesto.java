package patronesnuevo.estructurales.composite;

public class ElementoCompuesto implements Elemento
{

	Elemento elem1;
	Elemento elem2;
	
	
	
	
	public ElementoCompuesto(Elemento elem1, Elemento elem2)
	{
		super();
		this.elem1 = elem1;
		this.elem2 = elem2;
	}



	public Elemento getElem1()
	{
		return elem1;
	}



	public void setElem1(Elemento elem1)
	{
		this.elem1 = elem1;
	}



	public Elemento getElem2()
	{
		return elem2;
	}



	public void setElem2(Elemento elem2)
	{
		this.elem2 = elem2;
	}



	@Override
	public double calculaPrecio()
	{
		return elem1.calculaPrecio() + elem2.calculaPrecio();
	}
}
