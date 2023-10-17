package generadorDtos.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class FormaterJsonDotsIt extends FormaterJsonDotsPadre
{
	
	
	
	public List<String> formatJson2Dot(JSONObject json,String prefix)
	{
		List<String> lines= new ArrayList<String>();
		//for(String key:json.keySet())
		Iterator<String> it = json.keys();
		while(it.hasNext())
		{
			String key = it.next();
			
			System.out.println(key);
			createLines(json, prefix, lines, key);
		}
		
		
		
		
		
		return lines;
		
		
	}


	
}
