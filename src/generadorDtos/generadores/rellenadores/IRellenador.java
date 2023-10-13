package generadorDtos.generadores.rellenadores;

import java.lang.reflect.Field;

public interface IRellenador
{

	Object rellenaTipoPrimitivo(Field field);

	String rellenaTipoPrimitivoString(Field field);

}