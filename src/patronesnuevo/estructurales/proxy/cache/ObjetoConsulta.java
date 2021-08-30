package patronesnuevo.estructurales.proxy.cache;

public interface ObjetoConsulta
{

	public void conecta();
	
	public String consulta(Solicitud solicitud);
}
