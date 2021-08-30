package patronesnuevo.estructurales.proxy.cache;

public class Conexion
{

	private boolean abierta=false;
	
	public boolean abrirConexion()
	{
		if(!abierta)
			abierta= true;
		return true;
	}
	
	
	public String realizaQuery(String sql)
	{
		return "rtdo";
	}
}
