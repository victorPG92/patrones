package patronesnuevo.mediator;

import java.util.HashMap;
import java.util.Map;

public class MaquinaEstados
{
	private ObjetoConfigurable obj;
	
	private Map<Estado, Estado> transicionesAvance;
	private Map< Estado,Map<TipoTransicion, Estado>> transiciones;
	
	private Estado1 estado1;
	private Estado2 estado2;
	private Estado3 estado3;

	private Estado estadoActual;
	
	public MaquinaEstados(ObjetoConfigurable obj)
	{
		super();
		this.obj = obj;
		
		construyeEstados();
		construyeMapa();
		
		
		//obj.setEstado(estado1);
		estado1.configuraObjeto();
		
		estadoActual= estado1;
	}

	private void construyeEstados()
	{
		estado1= new Estado1(obj);
		estado2= new Estado2(obj);
		estado3= new Estado3(obj);
	}
	
	private void construyeMapa()
	{
		
		transicionesAvance = new HashMap<>();
		transicionesAvance.put(estado1, estado2);
		transicionesAvance.put(estado2, estado3);
		transicionesAvance.put(estado3, estado1);
		
		transiciones = new HashMap<>();
		HashMap<TipoTransicion, Estado> transiciones1 = new HashMap<>();
		HashMap<TipoTransicion, Estado> transiciones2 = new HashMap<>();
		HashMap<TipoTransicion, Estado> transiciones3 = new HashMap<>();
		
		
		transiciones1.put(TipoTransicion.avanza, estado2);
		transiciones2.put(TipoTransicion.avanza, estado3);
		transiciones3.put(TipoTransicion.avanza, estado1);
		
		transiciones1.put(TipoTransicion.retrocede, estado3);
		transiciones2.put(TipoTransicion.retrocede, estado1);
		transiciones3.put(TipoTransicion.retrocede, estado2);
		
		
		transiciones.put(estado1, transiciones1);
		transiciones.put(estado2, transiciones2);
		transiciones.put(estado3, transiciones3);

		
	}
	
	/**
	 * Cambia de estado, realizando algo mas
	 * @param transicion
	 */
	public  Estado avanzaEstadoPublico( Transicion transicion) 
	{
		return avanzaEstadoPublico(estadoActual,transicion);
	}
	/**
	 * Cambia de estado, realizando algo mas
	 * @param transicion
	 */
	private  Estado avanzaEstadoPublico(Estado estado, Transicion transicion) 
	{
		//Estado estadoNuevo= transicionesAvance.get(estado);
		
		estadoActual.actuaTransicionObjeto(transicion);
		
		Estado estadoNuevo= transiciones.get(estado).get(transicion.getTipo());
		
		
		System.out.println("estado nuevo "+ estadoNuevo);
		estadoNuevo.configuraObjeto();
		estadoActual= estadoNuevo;
		//obj.setEstado(estadoNuevo);
		//estadoNuevo.actuaObjeto();//puede ser y no 
		
		return estadoNuevo;
	}

	public Estado getEstadoActual()
	{
		return estadoActual;
	}

	
	
}
