package generadorDtos.dtos;

import java.util.List;

public class ListadoSimple
{

	List<DtoSimple> dtos;

	public List<DtoSimple> getDtos()
	{
		return dtos;
	}

	public void setDtos(List<DtoSimple> dtos)
	{
		this.dtos = dtos;
	}

	@Override
	public String toString()
	{
		return "ListadoSimple [dtos=" + dtos + "]";
	}
	
	
}
