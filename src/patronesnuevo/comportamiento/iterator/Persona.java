package patronesnuevo.comportamiento.iterator;

public class Persona implements IsIterable<String>
{

	private String nombre;
	private String apellido;
	private String direccion;
	private String dni;
	
	
	public Persona(String nombre, String apellido, String direccion, String dni)
	{
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
	}

	@Override
	public Iterador<String> getIterador()
	{
		return new PersonaIterador(this);
	}
	
	public class PersonaIterador implements Iterador<String>
	{
		Persona persona;

		public PersonaIterador(Persona persona)
		{
			super();
			this.persona = persona;
		}
		
		int indice=-1;

		@Override
		public String next()
		{
			indice++;
			
			switch (indice)
			{
			case 0:	return  nombre;
			case 1:	return  apellido;
			case 2:	return  direccion;
			case 3:	return  dni;

			default:
				return null;
			}
			
			
			
			
		}

		@Override
		public boolean hasMore()
		{
			return indice<3;
		}
		
		
		
	}
	
	
	
	
}
