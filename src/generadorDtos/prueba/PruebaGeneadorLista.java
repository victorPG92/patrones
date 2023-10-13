package generadorDtos.prueba;

import java.lang.reflect.InvocationTargetException;

import generadorDtos.dtos.Listado;
import generadorDtos.generadores.GeneradorRellenadorReflexion2;

public class PruebaGeneadorLista
{

	public static void main(String[] args)
	{
		GeneradorRellenadorReflexion2 r= new GeneradorRellenadorReflexion2();
		
		
		Listado l;
		try
		{
			l = r.generaRellenador(Listado.class);
			System.out.println(l);

		} catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException
				| SecurityException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
