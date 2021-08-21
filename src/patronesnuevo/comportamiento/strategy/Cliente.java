package patronesnuevo.comportamiento.strategy;

public class Cliente
{

	public void buscar(boolean b)
	{
		AlgoritmoBusqueda alg;
		
		if(b)
			alg= new Algoritmo1();
		else
			alg= new Algoritmo2();
		
		alg.busca(null, null);
		
		
	}
}
