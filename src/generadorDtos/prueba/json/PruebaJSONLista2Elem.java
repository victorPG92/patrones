package generadorDtos.prueba.json;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONObject;

import generadorDtos.dtos.Listado;
import generadorDtos.dtos.Padre;
import generadorDtos.generadores.GeneradorRellenadorReflexion2;
import generadorDtos.generadores.rellenadores.RellenadorFromJSON;

public class PruebaJSONLista2Elem
{

	
	public static void main(String[] args)
	{
		
		
		
		
		JSONObject listado= new JSONObject();
		System.out.println("listado "+listado);
		
		JSONArray lista= new JSONArray();
		listado.accumulate("padres", lista);
		System.out.println("lista "+lista);
		System.out.println("listado "+listado);

		
		JSONObject padre= new JSONObject();
		lista.put(padre);
		
		JSONObject dto= new JSONObject();
		
		padre.accumulate("dto", dto);
		
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
		
		
		
		JSONObject padre2= new JSONObject();
		lista.put(padre2);
		
		JSONObject dto2= new JSONObject();
		
		padre2.accumulate("dto", dto2);
		
		dto2.accumulate("id", "02");
		dto2.accumulate("name", "nombre2");
		dto2.accumulate("i", 12);
		dto2.accumulate("i2", 22);
		dto2.accumulate("d", 12.0);
		dto2.accumulate("d2", 22.0);
		dto2.accumulate("f", 12f);
		dto2.accumulate("f2", 22f);
		dto2.accumulate("l", 12l);
		dto2.accumulate("L2", 22L);
		dto2.accumulate("b", true);
		dto2.accumulate("b2", true);
		dto2.accumulate("date", new Date());
		
		RellenadorFromJSON r= new RellenadorFromJSON(listado);
		GeneradorRellenadorReflexion2 g= new GeneradorRellenadorReflexion2(r);
		
		try
		{
			//DTO dtoGenerado=g.generaRellenador(DTO.class);
			
			Listado listadoGenerado= g.generaRellenador(Listado.class);
			
			//System.out.println(dtoGenerado);
			System.out.println(listadoGenerado);
			
			System.out.println(listadoGenerado.getPadres().get(0));
			System.out.println(listadoGenerado.getPadres().get(1));
			
			
			Object id=listadoGenerado.getPadres().get(0).getDto().getId();
			System.out.println(id +" "+ id.getClass());
			String id2= (String) id;
			System.out.println(id2);
			
			

		} catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException
				| SecurityException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
		
		
		
		
		
	}
}
