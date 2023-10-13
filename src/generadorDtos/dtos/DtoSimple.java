package generadorDtos.dtos;

public class DtoSimple
{

	String id;

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	@Override
	public String toString()
	{
		return "DtoSimple [id=" + id + "]";
	}
	
	
}
