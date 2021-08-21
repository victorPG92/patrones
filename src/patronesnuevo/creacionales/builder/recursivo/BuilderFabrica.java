package patronesnuevo.creacionales.builder.recursivo;

import patronesnuevo.comportamiento.chainresponsability.segundoejemplo.FaseProduccion;

public interface BuilderFabrica
{
	
	public void inicializaFabrica();
	
	public FaseProduccion creaFaseEnfriamiento();

	public FaseProduccion creaFaseArranque();

	public FaseProduccion creaFasePresion();

	public Fabrica getFabricaResultado();
	
}
