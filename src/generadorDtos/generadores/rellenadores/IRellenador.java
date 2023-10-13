package generadorDtos.generadores.rellenadores;

import java.lang.reflect.Field;

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

}