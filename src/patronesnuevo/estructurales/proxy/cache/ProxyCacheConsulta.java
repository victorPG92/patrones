package patronesnuevo.estructurales.proxy.cache;

import java.util.HashMap;
import java.util.Map;

public class ProxyCacheConsulta implements ObjetoConsulta
{

	ObjetoConsulta obj;
	Map<String, String> resultados= new HashMap<>();
	
	
	@Override
	public void conecta()
	{
		obj.conecta();		
	}

	@Override
	public String consulta(Solicitud solicitud)
	{

		String consulta= solicitud.getConsulta();
		
		if(resultados.containsKey(consulta))
			return resultados.get(consulta);
		
		String rtdo= obj.consulta(solicitud);
		resultados.put(consulta, rtdo);
		
		return rtdo;
	}

}
