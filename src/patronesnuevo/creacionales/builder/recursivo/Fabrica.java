package patronesnuevo.creacionales.builder.recursivo;

import patronesnuevo.comportamiento.chainresponsability.segundoejemplo.FaseProduccion;

public class Fabrica
{

	private FaseProduccion fase;

	public FaseProduccion getFase()
	{
		return fase;
	}

	public void setFase(FaseProduccion fase)
	{
		this.fase = fase;
	}
	
	public void insertaFase(FaseProduccion fase)
	{
		if(this.fase==null)
			this.fase=fase;
		else
			fase.insertaFase(fase);
	}
	
	
}
