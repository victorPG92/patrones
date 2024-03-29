package generadorDtos.generadores.comprobaciones;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;

public class Comprobador {

	public boolean esTipoPrimitivo(Field field)
	{
	
		return esTipoPrimitivo(field.getType());
	}
	
	
	public boolean esColeccion(Field field)
	{
		return esColeccion(field.getType());
	}
	
	
	public boolean esTipoPrimitivo(Class<?> type)
	{
		return String.class.equals(type) 
				|| Integer.class.equals(type) || int.class.equals(type) 
				|| double.class.equals(type) || Double.class.equals(type)
				|| float.class.equals(type) || Float.class.equals(type)
				|| boolean.class.equals(type) || Boolean.class.equals(type)
				|| long.class.equals(type) || Long.class.equals(type)

				|| Date.class.equals(type)
				|| Timestamp.class.equals(type)
				;
		
	}
	
	
	public boolean esColeccion(Class<?> type)
	{
		return Collection.class.equals(type)
				|| java.util.List.class.equals(type)
				||java.util.Set.class.equals(type)
				
				;
	}
	
	
	public boolean tieneConstructorPorDefecto(Class<?> clase)
	{
		for(Constructor<?> constr:clase.getConstructors())
		{
			if(constr.getParameterCount()==0)
			{
				if(!constr.isAccessible())
				{
					constr.setAccessible(true);
				}
				return true;
			}
			
		}
		
		return false;
	}
	
	
}
