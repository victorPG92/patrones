package patronesnuevo.estructurales.proxy.cache;

public class Solicitud
{

	private String user;
	private String pwd;
	
	private String consulta;
	
	

	public Solicitud()
	{
		super();
	}

	public Solicitud(String user, String pwd, String consulta)
	{
		super();
		this.user = user;
		this.pwd = pwd;
		this.consulta = consulta;
	}

	public String getUser()
	{
		return user;
	}

	public void setUser(String user)
	{
		this.user = user;
	}

	public String getPwd()
	{
		return pwd;
	}

	public void setPwd(String pwd)
	{
		this.pwd = pwd;
	}

	public String getConsulta()
	{
		return consulta;
	}

	public void setConsulta(String consulta)
	{
		this.consulta = consulta;
	}
	
	
	
	
}
