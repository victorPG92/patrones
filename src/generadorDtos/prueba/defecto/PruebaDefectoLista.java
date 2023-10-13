package generadorDtos.prueba.defecto;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONObject;

import generadorDtos.dtos.Listado;
import generadorDtos.dtos.Padre;
import generadorDtos.generadores.GeneradorRellenadorReflexion2;
import generadorDtos.generadores.rellenadores.Rellenador;
import generadorDtos.generadores.rellenadores.RellenadorFromJSON;

public class PruebaDefectoLista
{

	
	public static void main(String[] args)
	{
		
		
		
		
		
		
		Rellenador r= new Rellenador();
		GeneradorRellenadorReflexion2 g= new GeneradorRellenadorReflexion2(r);
		
		try
		{
			//DTO dtoGenerado=g.generaRellenador(DTO.class);
			
			Listado listadoGenerado= g.generaRellenador(Listado.class);
			
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
