package patronesnuevo.comportamiento.mediator;

public class MainStates
{

	
	public static void main(String[] args)
	{
		
		ObjetoConfigurable obj = new ObjetoConfigurable();
		MaquinaEstados maq= new MaquinaEstados(obj);
		obj.setMaquinaEstados(maq);
		
		
		obj.actua();
		
		obj.avanza();
		obj.actua();
		
		obj.avanza();
		obj.actua();
		
		obj.retrocede();
		obj.actua();
		
		
		
		
		
	}
}
