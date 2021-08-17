package patronesnuevo.creacionales.singleton;

public class Cliente
{

	public static void main(String[] args)
	{
		System.out.println(ClaseSingleton.getInst()== ClaseSingleton.getInst());
		
		ClaseSingleton o1= ClaseSingleton.getInst();
		ClaseSingleton o2= ClaseSingleton.getInst();
		
		System.out.println(o1==o2);

	}
}
