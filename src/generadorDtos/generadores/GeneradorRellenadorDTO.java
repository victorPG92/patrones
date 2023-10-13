package generadorDtos.generadores;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import generadorDtos.generadores.comprobaciones.Comprobador;
import generadorDtos.generadores.rellenadores.Rellenador;
import generadorDtos.utils.Escritor;
import generadorDtos.utils.EscritorConsola;
import generadorDtos.utils.UtilsStringFormat;
import generadorDtos.utils.UtilsStringJava;

public class GeneradorRellenadorDTO {

	Comprobador comprobador = new Comprobador();
	Rellenador rellenador =new Rellenador();   
	Set<Class> pendientes= new HashSet<>();
	public <T> void generaRellenador(Class<T> clase) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
	//	T obj = clase.newInstance();
		Escritor esc = new EscritorConsola();
		String nombreClase= clase.getSimpleName();
	//	MetodoDto< CuerpoInstruccionesString> metodo= new MetodoDto<>("generaMock"+nombreClase, nombreClase);
	//	CuerpoInstruccionesString cuerpo= new CuerpoInstruccionesString();
	//	metodo.setCuerpo(cuerpo);
		//	System.out.println("nuevo objeto "+ obj);
		esc.abrirEscritor("Generador");
		esc.escribirLineaTab("public "+ clase.getCanonicalName() + " genera"+nombreClase+"(){");
		esc.aumentaTab();
		String objClase= UtilsStringFormat.toVar(clase.getSimpleName()) ;

		esc.escribirLineaTab(UtilsStringJava.declaraConstruyeVarTipo(nombreClase));
		for(Field field: clase.getDeclaredFields())
		{
			Object valorASignado=null;
			//System.out.println("field "+field.toString());
			if(comprobador.esTipoPrimitivo(field))
			{
				//System.out.println("field es primitivo "+ field.getType());
				valorASignado= rellenador.rellenaTipoPrimitivoString(field);
				//String nombreSetter= "set"+capitalize(field.getName());
				
				//System.out.println("field es primitivo nombreSetter"+ nombreSetter);
				//System.out.println("field es primitivo valorASignado"+ valorASignado);

				//obj.getClass().getDeclaredMethod(nombreSetter, field.getType()).invoke(obj,valorASignado );
			}
			else
			{
				System.err.println("//"+field.getType());
				valorASignado ="genera"+Util.capitalize(field.getType().getSimpleName())+"()";
				pendientes.add(field.getType());
				
			//	generaRellenador(field.getDeclaringClass());
			}
			
			esc.escribirLineaTab(UtilsStringJava.creaSet(objClase, field.getName(), Objects.toString(valorASignado.toString()))+";");
			
			
		}
		
		esc.escribirLineaTab("");

		esc.escribirLineaTab("return "+objClase+ ";");

		esc.reduceTab();
		esc.escribirLineaTab("}");
		pendientes.remove(clase);
		
		for (Class class1 : pendientes) {
			generaRellenador(class1);
		}
		
	}
	
	

	
	
	
}
