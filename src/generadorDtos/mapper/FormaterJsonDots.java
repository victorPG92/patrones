package generadorDtos.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class FormaterJsonDots
{

	
	public List<String> formatJson2Dot(String json, String prefix)
	{
		JSONObject json2 = new JSONObject(json);
		
		return formatJson2DotIt(json2,prefix);
		
		
		
	}
	
	
	public List<String> formatJson2Dot(JSONObject json,String prefix)
	{
		List<String> lines= new ArrayList<String>();
		//for(String key:json.keySet())
		for(String key:json.keySet())
		{
			createLines(json, prefix, lines, key);
		}
		
		
		
		json.names();
		
		
		return lines;
		
		
	}
	
	
	public List<String> formatJson2DotIt(JSONObject json,String prefix)
	{
		List<String> lines= new ArrayList<String>();
		//for(String key:json.keySet())
		Iterator<String> it = json.keys();
		while(it.hasNext())
		{
			createLines(json, prefix, lines, it.next());
		}
		
		
		
		json.names();
		
		
		return lines;
		
		
	}


	private void createLines(JSONObject json, String prefix, List<String> lines, String key)
	{
		String keyPrefix= prefix+"."+key;
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
		else
		{
			lines.add(keyPrefix);
			
		}
	}
}
