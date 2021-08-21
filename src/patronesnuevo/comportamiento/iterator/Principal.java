package patronesnuevo.comportamiento.iterator;

public class Principal
{

	
	public static void main(String[] args)
	{
		Iterador<String> it= new Persona("juan","perez","callse falsa","00000000J").getIterador();
		
		do
		{
			System.out.println(it.next());
		}while(it.hasMore());
		
	}
}
