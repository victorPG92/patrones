package generadorDtos.prueba.defecto;

import java.lang.reflect.InvocationTargetException;

import generadorDtos.dtos.Padre;
import generadorDtos.generadores.GeneradorRellenadorReflexion2;
import generadorDtos.generadores.rellenadores.Rellenador;

public class PruebaDefectoPadre
{

	
	public static void main(String[] args)
	{
		
		
		Rellenador r= new Rellenador();
		GeneradorRellenadorReflexion2 g= new GeneradorRellenadorReflexion2(r);
		
		try
		{
			//DTO dtoGenerado=g.generaRellenador(DTO.class);
			
			Padre padreGenerado= g.generaRellenador(Padre.class);
			
			//System.out.println(dtoGenerado);
			System.out.println(padreGenerado);

		} catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException
				| SecurityException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
		
		
		
		
		
	}
}
