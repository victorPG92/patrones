package patronesnuevo.estructurales.proxy.cache;

public class ConsultaFactory
{

	/**
	 * Se encarga de devolver con proxy
	 * @return
	 */
	public ObjetoConsulta creaConsulta()
	{
		ObjetoConsulta obj = new ObjetoConsultaImpl();
		
		ObjetoConsulta proxy= new ProxyCacheConsulta(obj);
		
		
		return proxy;
		
		
	}
}
