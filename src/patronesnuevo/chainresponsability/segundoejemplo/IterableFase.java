package patronesnuevo.chainresponsability.segundoejemplo;

import java.util.Iterator;

public abstract class IterableFase extends FaseProduccion implements Iterable<FaseProduccion>
{
	FaseProduccion fase;
	
	

	public IterableFase(FaseProduccion fase)
	{
		super();
		this.fase = fase;
	}



	@Override
	public Iterator<FaseProduccion> iterator()
	{
		return new IteratorFase(fase);
	}


	
	
}
