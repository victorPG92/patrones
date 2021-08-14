package patronesnuevo.chainresponsability.segundoejemplo;

public class Main
{

	public static void main(String[] args)
	{
		FactMaquinaFases.getFases().actuar(new MaquinaElectrica(120, 50, 1000));
		FactMaquinaFases.getFases().actuar(new MaquinaElectrica(100, 50, 1600));

		FactMaquinaFases.getFases().actuar(new MaquinaElectrica(120, 50, 1600));

	}
}
