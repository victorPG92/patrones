package patronesnuevo.comportamiento.chainresponsability;

/**
 * Crea la cadena de validadores
 * @author victor
 *
 */
public class FactValidador
{

	public static Validador<Persona> creaValidador()
	{
		Validador<Persona> valNombre= new ValidadorNombre();
		valNombre.insertaValidador(new ValidadorApellido());
		valNombre.insertaValidador(new ValidadorDir());
		valNombre.insertaValidador(new ValidadorDni());
		
		return valNombre;


	}
}
