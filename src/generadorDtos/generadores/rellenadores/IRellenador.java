package generadorDtos.generadores.rellenadores;

import java.lang.reflect.Field;
import java.util.List;

public interface IRellenador<T>
{

	Object rellenaTipoPrimitivo(Field field);

	String rellenaTipoPrimitivoString(Field field);
	
	/**
	 * usado por el json
	 */
	void setOrigen(T origen);
	

	/**
	 * usado por el json
	 */
	T getOrigen(Field field);
	
	/**
	 * usado por el json
	 */
	T getOrigen();
	
	
	/**
	 * usado por el json
	 */
	List<T> getOrigenListado(Field field);

}