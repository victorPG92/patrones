package patronesnuevo.chainresponsability.segundoejemplo;

import java.util.Iterator;

public class IteratorFase implements Iterator<FaseProduccion>
{
	private FaseProduccion faseActual;	

	public IteratorFase(FaseProduccion faseActual)
	{
		super();
		this.faseActual = faseActual;
	}

	@Override
	public boolean hasNext()
	{
		return faseActual.tieneSiguiente();
	}

	@Override
	public FaseProduccion next()
	{
		faseActual= faseActual.getFaseSig();
		return faseActual;
	}

	
}
