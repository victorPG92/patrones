package generadorDtos.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class FormaterJsonDotsKeys extends FormaterJsonDotsPadre
{
	
	public List<String> formatJson2Dot(JSONObject json,String prefix)
	{
		List<String> lines= new ArrayList<String>();
		//for(String key:json.keySet())
		for(String key:json.keySet())
		{
			System.out.println(key);
			createLines(json, prefix, lines, key);
		}
		
		
		
		json.names();
		
		
		return lines;
		
		
	}
	
	
	


	
}
