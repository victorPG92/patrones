package generadorDtos.dtos;

public class Padre {

	DTO dto;

	public DTO getDto() {
		return dto;
	}

	public void setDto(DTO dto) {
		this.dto = dto;
	}

	@Override
	public String toString()
	{
		return "Padre [dto=" + dto + "]";
	}
	
	
}
