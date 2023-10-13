package generadorDtos.prueba;

import generadorDtos.dtos.DTO;
import generadorDtos.dtos.Padre;
import generadorDtos.validador.ValidadorDto;

public class PruebaValidador
{
	
	public static void main(String[] args) {
		ValidadorDto val= new ValidadorDto();
		System.out.println("hola".equals(val.toVar("Hola")));
		boolean esDtoPadre = val.esDto(Padre.class);
		System.out.println(esDtoPadre);
		
		boolean esDtoDto = val.esDto(DTO.class);
		
		System.out.println(esDtoDto);
		
		System.out.println("FIN");
		
		//System.out.println(val.esDto(DTO.class));
	}

}
