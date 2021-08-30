package patronesnuevo.estructurales.proxy.cache.cliente;

import patronesnuevo.estructurales.proxy.cache.ConsultaFactory;
import patronesnuevo.estructurales.proxy.cache.ObjetoConsulta;

public class Cliente
{

	public static void main(String[] args)
	{
		ObjetoConsulta obj = new ConsultaFactory().creaConsulta();
		
		// no se crea solo
	}
}
