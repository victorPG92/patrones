package patronesnuevo.chainresponsability;

public class ValidadorNombre extends Validador<Persona>
{

	@Override
	protected boolean esValido(Persona pers)
	{
		System.out.println("validando nombre");

		return new StringValidador().esValido(pers.getNombre());
	}

}
