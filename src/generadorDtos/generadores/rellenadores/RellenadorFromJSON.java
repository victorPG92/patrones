package generadorDtos.generadores.rellenadores;

import java.lang.reflect.Field;
import java.util.Date;

import org.json.JSONObject;

public class RellenadorFromJSON implements IRellenador
{
	JSONObject json;
	
	
	

	public RellenadorFromJSON(JSONObject json)
	{
		super();
		this.json = json;
	}

	public Object rellenaTipoPrimitivo(Field field)
	{
		
		Class<?> type = field.getType();
		String fieldName= field.getName();
		
		
		//System.out.println("//type "+ type +" en "+  field);
		if( String.class.equals(type))
			return json.optString(fieldName);
		else if(Integer.class.equals(type) || int.class.equals(type))
			return json.optInt(fieldName);
		else if(Double.class.equals(type) || double.class.equals(type))
			return json.optDouble(fieldName);
		else if(Float.class.equals(type) || float.class.equals(type))
			return json.optFloat(fieldName);
		else if(Long.class.equals(type) || long.class.equals(type))
			return json.optLong(fieldName);
		else if(Boolean.class.equals(type) || boolean.class.equals(type))
			return json.optBoolean(fieldName);
		else if(Date.class.equals(type))
			return null;
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

}
