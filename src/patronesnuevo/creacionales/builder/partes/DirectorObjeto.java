package patronesnuevo.creacionales.builder.partes;

public class DirectorObjeto
{
	public ObjectoCompuesto creaObjeto(BuilderObjetoCompuesto b)
	{
		
		b.inicializaObj();
		
		b.creaParteA();
		b.creaParteB();
		
		ObjectoCompuesto obj = b.getRtdo();
		
		return obj;
	}
}
