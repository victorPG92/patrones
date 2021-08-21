package patronesnuevo.creacionales.builder.recursivo;

import patronesnuevo.comportamiento.chainresponsability.segundoejemplo.FaseArranqueEnergia;
import patronesnuevo.comportamiento.chainresponsability.segundoejemplo.FasePresion;
import patronesnuevo.comportamiento.chainresponsability.segundoejemplo.FaseProduccion;

public class Director
{
	BuilderFabrica bf;
	

	public Director(BuilderFabrica bf)
	{
		super();
		this.bf = bf;
	}


	public  Fabrica getFabrica(boolean necesitaEnfriamiento)
	{
		bf.inicializaFabrica();
		
		bf.creaFaseArranque();
		// elige si ejecutar este metodo del builder, por eso es director
		if(necesitaEnfriamiento)
			bf.creaFaseEnfriamiento();
		bf.creaFasePresion();
		
		return bf.getFabricaResultado();
		
	}
}
