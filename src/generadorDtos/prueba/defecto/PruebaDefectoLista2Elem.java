package generadorDtos.prueba.defecto;

import java.lang.reflect.InvocationTargetException;

import generadorDtos.dtos.Listado;
import generadorDtos.generadores.GeneradorRellenadorReflexion2;
import generadorDtos.generadores.rellenadores.Rellenador;

public class PruebaDefectoLista2Elem
{

	
	public static void main(String[] args)
	{
		
		
		
		


		
		Rellenador r= new Rellenador();
		r.setNumLista(2);
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
