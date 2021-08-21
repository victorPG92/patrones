package patronesnuevo.comportamiento.chainresponsability;

public class ValidadorDir extends Validador<Persona>
{

	@Override
	protected boolean esValido(Persona pers)
	{
		System.out.println("validando dir");

		return new StringValidador().esValido(pers.getDireccion());
	}

}
