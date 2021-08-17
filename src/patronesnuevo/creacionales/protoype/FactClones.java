package patronesnuevo.creacionales.protoype;

import java.util.HashMap;
import java.util.Map;

public class FactClones<T extends Clonable<T>>
{

	Map<String,T> prototipos = new HashMap<>();
	
	public void putPrototipo(String key, T prot)
	{
		prototipos.put(key, prot);
	}
	
	public Clonable<T> getClon(String clave)
	{
		T clon=null;
		
		T prototipo = prototipos.get(clave);
		if(prototipo!=null)
		{
			clon= prototipo.clonar();
		}
		
		return clon;
	}
	
}
