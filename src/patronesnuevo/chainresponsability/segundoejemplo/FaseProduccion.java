package patronesnuevo.chainresponsability.segundoejemplo;

/**
 * En la cor 
 * en cada fase se decide si:
 * debe actuar
 * si debe continuar
 * 
 * por ello, se crear esos metodos
 * 
 * a la vez, en este caso, se hace un template method
 * porque tiene el esqueleto principal y se deben implementar algunos metodos
 * 
 * @author victor
 *
 */
public abstract class FaseProduccion
{

	protected FaseProduccion faseSig;
	
	public void actuar(MaquinaElectrica maq)
	{
		System.out.println(this.toString());
		if(debeActuar(maq))
		{
			System.out.println("debe actuar "+ this );
			actua(maq);
		
		}
		if(faseSig!=null && debeSeguir(maq)) {
			System.out.println("debe seguir "+ this );
			faseSig.actuar(maq);
		}
		System.out.println();
		
	}
	
	protected abstract boolean debeActuar(MaquinaElectrica maq);
	protected abstract void actua(MaquinaElectrica maq);

	protected abstract boolean debeSeguir(MaquinaElectrica maq);

	public void insertaValidador(FaseProduccion newVal)
	{
		if(faseSig==null)
			faseSig=newVal;
		else
			faseSig.insertaValidador(newVal);
	}
	
	
	public boolean tieneSiguiente()
	{
		return faseSig!=null;
	}

	public FaseProduccion getFaseSig()
	{
		return faseSig;
	}

	/**
	 * Devuelve si reemplaza
	 * 
	 * @param faseSig
	 * @return
	 */
	public boolean setFaseSig(FaseProduccion faseSig)
	{
		boolean b= tieneSiguiente();
		this.faseSig = faseSig;
		
		return b;
	}
	
	public void anteponeSiguiente(FaseProduccion faseSigNueva)
	{
		FaseProduccion aux= faseSig;
		faseSig=faseSigNueva;
		faseSigNueva.faseSig=aux;
	}
}
