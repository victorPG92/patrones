package generadorDtos.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public abstract class FormaterJsonDotsPadre
{

	
	public List<String> formatJson2Dot(String json, String prefix)
	{
		JSONObject json2 = new JSONObject(json);
		
		return formatJson2Dot(json2,prefix);
		
		
		
	}
	
	
	public abstract List<String> formatJson2Dot(JSONObject json,String prefix);
	

	protected void createLines(JSONObject json, String prefix, List<String> lines, String key)
	{
		String keyPrefix= prefix+"."+key;
		
		lines.add(keyPrefix);
		
		Object value = json.get(key);
		
		
		if(value instanceof JSONObject)
		{
			lines.addAll(formatJson2Dot((JSONObject)value,keyPrefix));
		}
		else if(value instanceof JSONArray)
		{
			JSONArray a= (JSONArray) value;
			Object o=a.get(0);
			JSONObject jsonObject;
			if(o instanceof JSONObject)
			{
				jsonObject= (JSONObject) o;
			}
			else if(o instanceof JSONArray)
			{
				JSONArray a2= (JSONArray) a;
				jsonObject= a2.getJSONObject(0);
			}
			else
				jsonObject=null;
			lines.addAll(formatJson2Dot(jsonObject,keyPrefix));

		}
		
	}
}
