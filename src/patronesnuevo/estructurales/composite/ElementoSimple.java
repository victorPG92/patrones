package patronesnuevo.estructurales.composite;

public class ElementoSimple implements Elemento
{ 

	public String id;
	public double precio;
	
	
	public ElementoSimple(String id, double precio)
	{
		super();
		this.id = id;
		this.precio = precio;
	}


	@Override
	public double calculaPrecio()
	{
		return precio;
	}


	public String getId()
	{
		return id;
	}


	public void setId(String id)
	{
		this.id = id;
	}


	public double getPrecio()
	{
		return precio;
	}


	public void setPrecio(double precio)
	{
		this.precio = precio;
	}
	
	
	
	
}
