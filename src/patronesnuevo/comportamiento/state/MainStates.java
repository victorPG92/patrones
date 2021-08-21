package patronesnuevo.comportamiento.state;

public class MainStates
{

	
	public static void main(String[] args)
	{
		
		ObjetoConfigurable obj = new ObjetoConfigurable();
		obj.setEstado(new Estado1());
		
		obj.actua();
		
		obj.avanza();
		obj.actua();
		
		obj.avanza();
		obj.actua();
		
		obj.retrocede();
		obj.actua();
		
		
		
		
		
	}
}
