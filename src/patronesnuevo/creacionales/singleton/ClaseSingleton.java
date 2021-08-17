package patronesnuevo.creacionales.singleton;

/**
 * Una clase singleton tiene
 * constructor privado
 * atributo instancia static privado
 * accesor a instancia static public
 * 
 * @author victor
 *
 */
public class ClaseSingleton
{

	private static ClaseSingleton inst;//= new ClaseSingleton(); //carga pesada
	
	private  ClaseSingleton()
	{
		
	}
	
	public static ClaseSingleton getInst()
	{
		if(inst==null)
			inst= new ClaseSingleton(); //carga perezosa
		
		return inst;
	}
}
