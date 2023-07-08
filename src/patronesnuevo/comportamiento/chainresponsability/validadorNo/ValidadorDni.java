package patronesnuevo.comportamiento.chainresponsability.validadorNo;

public class ValidadorDni extends Validador<Persona>
{

	@Override
	protected boolean esValido(Persona pers)
	{
		System.out.println("validando dni");
		return new StringValidador().esValido(pers.getDni());
	}

}
