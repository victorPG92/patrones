package patronesnuevo.chainresponsability;

public class StringValidador extends Validador<String>
{

	@Override
	protected boolean esValido(String obj)
	{
		return obj!=null && !obj.isEmpty();
	}

	
}
