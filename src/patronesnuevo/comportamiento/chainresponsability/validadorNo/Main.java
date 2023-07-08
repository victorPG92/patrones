package patronesnuevo.comportamiento.chainresponsability.validadorNo;

public class Main
{

	
	public static void main(String[] args)
	{
		System.out.println(FactValidador.creaValidador().valida(new Persona("","","","")));
		System.out.println(FactValidador.creaValidador().valida(new Persona("pepe","","","")));
		System.out.println(FactValidador.creaValidador().valida(new Persona("pepe","ruiz","","")));
		System.out.println(FactValidador.creaValidador().valida(new Persona("pepe","ruiz","calle","")));
		System.out.println(FactValidador.creaValidador().valida(new Persona("pepe","ruiz","calle","dni")));

	}
}
