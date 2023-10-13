package generadorDtos.prueba.defecto;

import java.lang.reflect.InvocationTargetException;

import generadorDtos.dtos.DTO;
import generadorDtos.generadores.GeneradorRellenadorReflexion2;
import generadorDtos.generadores.rellenadores.Rellenador;

public class PruebaDefectoSimple
{

	
	public static void main(String[] args)
	{
		
	
		
		Rellenador r= new Rellenador();
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
