package patronesnuevo.chainresponsability;

/**
 * Validador de chain of responsability
 * tiene un validador siguiente
 * 
 * el siguiente se ejecuta si el actual, ha dado correcto
 * 
 * @author victor
 *
 * @param <T>
 */
public abstract class Validador<T>
{

	private Validador<T> sigValidador;
	
	public boolean valida(T obj)
	{
		boolean esValido= esValido(obj);
		
		//en cop, se diferencia de otros,
		//porque en cada elemento se controla si debe seguir o no
		//puede haber elementos que no se ejecuten
		if(esValido && sigValidador!=null)
			esValido= sigValidador.valida(obj);
		
		return esValido;
		
	}

	protected abstract boolean esValido(T obj);
	
	
	public void insertaValidador(Validador<T> newVal)
	{
		if(sigValidador==null)
			sigValidador=newVal;
		else
			sigValidador.insertaValidador(newVal);
	}
		
}
