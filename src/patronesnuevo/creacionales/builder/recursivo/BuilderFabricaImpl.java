package patronesnuevo.creacionales.builder.recursivo;

import patronesnuevo.comportamiento.chainresponsability.segundoejemplo.FaseArranqueEnergia;
import patronesnuevo.comportamiento.chainresponsability.segundoejemplo.FaseEnfriamiento;
import patronesnuevo.comportamiento.chainresponsability.segundoejemplo.FasePresion;
import patronesnuevo.comportamiento.chainresponsability.segundoejemplo.FaseProduccion;

public class BuilderFabricaImpl implements BuilderFabrica
{
	Fabrica fabrica;
	
	@Override
	public void inicializaFabrica()
	{
		fabrica = new FabricaEnergetica();		
	}
	
	public FaseProduccion creaFaseEnfriamiento()
	{
		FaseEnfriamiento fase = new FaseEnfriamiento();
		
		return fase;
	}

	public FaseProduccion creaFaseArranque()
	{
		return new FaseArranqueEnergia();
	}

	public FaseProduccion creaFasePresion()
	{
		return new FasePresion();
	}

	@Override
	public Fabrica getFabricaResultado()
	{
		return fabrica;
	}

	

	
}
