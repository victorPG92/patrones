package generadorDtos.generadores.rellenadores;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Rellenador implements IRellenador {

	@Override
	public Object rellenaTipoPrimitivo(Field field)
	{
		
		Class<?> type = field.getType();
		//System.out.println("//type "+ type +" en "+  field);
		if( String.class.equals(type))
			return "hola";
		else if(Integer.class.equals(type) || int.class.equals(type))
			return 1;
		else if(Double.class.equals(type) || double.class.equals(type))
			return 2.0;
		else if(Float.class.equals(type) || float.class.equals(type))
			return 3f;
		else if(Long.class.equals(type) || long.class.equals(type))
			return 4l;
		else if(Boolean.class.equals(type) || boolean.class.equals(type))
			return true;
		else if(Date.class.equals(type))
			return new Date();
		else
			return null;
	}
	
	@Override
	public String rellenaTipoPrimitivoString(Field field)
	{
		Object obj= rellenaTipoPrimitivo(field);
		Class<?> type = field.getType();
		if(obj==null)
			return "null";
		else if( String.class.equals(type))
			return "\"" +obj+"\"";
		else if(Float.class.equals(type) || float.class.equals(type))
			return obj+"f";
		else if(Long.class.equals(type) || long.class.equals(type))
			return obj+"l";
		else if(Date.class.equals(type))
			return "new Date()";
		else
			return obj.toString();
	}

	@Override
	public void setOrigen(Object origen)
	{
		
	}

	@Override
	public Object getOrigen(Field field)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getOrigenListado(Field field)
	{
		List l= new ArrayList<>();
		l.add(null);
		return l;
	}

	@Override
	public Object getOrigen()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
