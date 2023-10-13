package generadorDtos.prueba;

import java.util.Date;

import generadorDtos.dtos.DTO;
import generadorDtos.dtos.Padre;

public class Generador {

	public generadorDtos.dtos.Padre generaPadre(){
		Padre padre = new Padre();
	//class dtos.dto.DTO
		padre.setDto(generaDTO());
		
		return padre;
	}
	public generadorDtos.dtos.DTO generaDTO(){
		DTO dTO = new DTO();
		dTO.setId("hola");
		dTO.setName("hola");
		dTO.setI(1);
		dTO.setI2(1);
		dTO.setD(2.0);
		dTO.setD2(2.0);
		dTO.setF(3.0f);
		dTO.setF2(3.0f);
		dTO.setL(4l);
		dTO.setL2(4l);
		dTO.setB(true);
		dTO.setB2(true);
		dTO.setDate(new Date());
	//class java.security.Timestamp
		
		return dTO;
	}
	


}
