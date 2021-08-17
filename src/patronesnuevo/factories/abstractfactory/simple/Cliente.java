package patronesnuevo.factories.abstractfactory.simple;

import patronesnuevo.factories.A;
import patronesnuevo.factories.B;

public class Cliente
{

	FactObjectos fact;
	
	
	
	public Cliente(FactObjectos fact)
	{
		super();
		this.fact = fact;
	}



	public void hazAlgo()
	{
		//necesito un objeto A y otro B, pero no se su implementacion, de eso se encarga la factoria
		//lo que se,es que el A y B que se creen de la misma familia , impl o impl2
		A requeridaA= fact.creaA();
		B requeridaB= fact.creaB();
		
		
		
		
	}
}
