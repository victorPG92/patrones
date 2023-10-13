package generadorDtos.validador;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

import generadorDtos.generadores.Util;

public class ValidadorDto
{
	
	public boolean esDto(Class clase)
	{
		
		for(Method method:clase.getDeclaredMethods())
		{
			if(!excluirMetodo(method))
			{
				if(!existeAtributoCoincidente(clase, method))
				{
					System.err.println("No existe atrib de metodo "+ method.getName());
					return false;
				}
				//System.out.println("Existe atrib de metodo "+ method.getName());

			}
			
		}
		
		Class padre= clase.getSuperclass();
		
		if(!Object.class.equals(padre))
		{
			return esDto(padre);
		}
		
		
		return true;
	}
	
	
	public boolean excluirMetodo(Method method)
	{
		String name= method.getName();
		return "toString".equalsIgnoreCase(name)
				|| "hashCode".equalsIgnoreCase(name)
				|| "equals".equalsIgnoreCase(name)
				|| "compare".equalsIgnoreCase(name)
				;
	}
	
	private boolean existeAtributoCoincidente(Class clase, Method method)
	{
		String name= method.getName();
		if(name.startsWith("get") || name.startsWith("set"))
		{
			name= name.substring(3);
		}
		else if(name.startsWith("is"))
		{
			name= name.substring(2);
		}			
		else
		{
			System.err.println("Metodo que no empieza por get o set");
			return false;
		}
		name=toVar(name);
		
		
		boolean existe= existeDeclaredField(clase, name);
		//System.out.println("Existe 1 "+name+ " "+ existe);
		
		if(!existe)
		{
			existe= existeField(clase, name);
		}
		
		
		
		return existe;
	}
	
	private boolean existeField(Class clase, String name)
	{
		Field field =null;
		try {
			//System.out.println("Buscando "+name);
			 field= clase.getField(name);
			// System.out.println("Encontrado "+field.toString());
		} catch (NoSuchFieldException | SecurityException e) {
			//System.out.println("fields de "+clase.getCanonicalName() + Arrays.toString(clase.getFields()));
			System.err.println(name + " no encontrado con getField");
			
			for (Field field2 : clase.getFields()) 
			{
				//System.out.println("analizando fields "+ field2.getName());
				if(field2.getName().equals(name))
					field=field2;
			}
		}
		
		return field!=null;
	}
	
	private boolean existeDeclaredField(Class clase, String name)
	{
		Field field =null;
		try {
			//System.out.println("Buscando "+name);
			 field= clase.getDeclaredField(name);
			 //System.out.println("Encontrado "+field.toString());
			

		} catch (NoSuchFieldException | SecurityException e) {
			
			 try {
				 name= Util.capitalize(name);
					//System.out.println("Buscando "+name);
					 field= clase.getDeclaredField(name);
					 //System.out.println("Encontrado "+field.toString());

				} catch (NoSuchFieldException | SecurityException e2) {
					System.out.println("fields de "+clase.getCanonicalName() + Arrays.toString(clase.getFields()));
					System.err.println(name + " no encontrado con getField");
					
					for (Field field2 : clase.getDeclaredFields()) 
					{
						System.out.println("analizando fields "+ field2.getName());
						if(field2.getName().equals(name))
							field=field2;
					}
				}
			
			
			
		}
		
		return field!=null;
	}
	
	public String toVar(String s)
	{
		String inicial=""+Character.toLowerCase(s.charAt(0));
		return inicial+  s.substring(1);
	}


}
