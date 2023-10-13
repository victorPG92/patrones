package generadorDtos.prueba.json;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.json.JSONObject;

import generadorDtos.dtos.DTO;
import generadorDtos.generadores.GeneradorRellenadorReflexion2;
import generadorDtos.generadores.rellenadores.RellenadorFromJSON;

public class PruebaJSONSimple
{

	
	public static void main(String[] args)
	{
		
		
		JSONObject dto= new JSONObject();
		
		
		dto.accumulate("id", "01");
		dto.accumulate("name", "nombre");
		dto.accumulate("i", 1);
		dto.accumulate("i2", 2);
		dto.accumulate("d", 1.0);
		dto.accumulate("d2", 2.0);
		dto.accumulate("f", 1f);
		dto.accumulate("f2", 2f);
		dto.accumulate("l", 1l);
		dto.accumulate("L2", 2L);
		dto.accumulate("b", true);
		dto.accumulate("b2", true);
		dto.accumulate("date", new Date());
		
		RellenadorFromJSON r= new RellenadorFromJSON(dto);
		GeneradorRellenadorReflexion2 g= new GeneradorRellenadorReflexion2(r);
		
		try
		{
			DTO dtoGenerado=g.generaRellenador(DTO.class);
			
			
			System.out.println(dtoGenerado);

		} catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException
				| SecurityException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
		
		
		
		
		
	}
}
