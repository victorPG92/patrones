package generadorDtos.dtos;

import java.util.List;

public class Listado
{

	List<Padre> padres;
	
	

	public Listado()
	{
		super();
	}

	public Listado(List<Padre> padres)
	{
		super();
		this.padres = padres;
	}

	public List<Padre> getPadres()
	{
		return padres;
	}

	public void setPadres(List<Padre> padres)
	{
		this.padres = padres;
	}

	@Override
	public String toString()
	{
		return "Listado [padres=" + padres + "]";
	}
	
	
}
