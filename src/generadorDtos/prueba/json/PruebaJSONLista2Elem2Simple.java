package generadorDtos.prueba.json;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONObject;

import generadorDtos.dtos.Listado;
import generadorDtos.dtos.ListadoSimple;
import generadorDtos.dtos.Padre;
import generadorDtos.generadores.GeneradorRellenadorReflexion2;
import generadorDtos.generadores.rellenadores.RellenadorFromJSON;

public class PruebaJSONLista2Elem2Simple
{

	
	public static void main(String[] args)
	{
		
		
		
		
		JSONObject listado= new JSONObject();
		System.out.println("listado "+listado);
		
		JSONArray lista= new JSONArray();
		listado.accumulate("dtos", lista);
	
		JSONObject dto1= new JSONObject();
		dto1.accumulate("id", "01");
		lista.put(dto1);		
		
		JSONObject padre2= new JSONObject();
		padre2.accumulate("id", "02");
		lista.put(padre2);
		
		
		
		RellenadorFromJSON r= new RellenadorFromJSON(listado);
		GeneradorRellenadorReflexion2 g= new GeneradorRellenadorReflexion2(r);
		
		try
		{
			//DTO dtoGenerado=g.generaRellenador(DTO.class);
			
			ListadoSimple listadoGenerado= g.generaRellenador(ListadoSimple.class);
			
			//System.out.println(dtoGenerado);
			System.out.println(listadoGenerado);
			
		
			

		} catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException
				| SecurityException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
		
		
		
		
		
	}
}
