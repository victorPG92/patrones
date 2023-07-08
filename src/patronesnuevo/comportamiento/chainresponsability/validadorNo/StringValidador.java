package patronesnuevo.comportamiento.chainresponsability.validadorNo;

/**
 * Valida si la cadena es vacia o null
 * @author victor
 *
 */
public class StringValidador extends Validador<String>
{

	@Override
	protected boolean esValido(String obj)
	{
		return obj!=null && !obj.isEmpty();
	}

	
}
