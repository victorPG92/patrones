package patronesnuevo.estructurales.proxy.cache;

public class ObjetoConsultaImpl implements ObjetoConsulta
{
	Conexion conexion;
	
	protected ObjetoConsultaImpl() {}

	@Override
	public void conecta()
	{

		System.out.println("Crea conexion");
		if(conexion==null)
		{
			conexion= new Conexion();
			conexion.abrirConexion();
		
		}
	}

	@Override
	public String consulta(Solicitud solicitud)
	{
		
		return conexion.realizaQuery(solicitud.getConsulta());
	}

}
