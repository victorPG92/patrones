package patronesnuevo.comportamiento.chainresponsability;

public class ValidadorApellido extends Validador<Persona>
{

	@Override
	protected boolean esValido(Persona pers)
	{
		System.out.println("validando apell");

		return new StringValidador().esValido(pers.getApellido());
	}

}
