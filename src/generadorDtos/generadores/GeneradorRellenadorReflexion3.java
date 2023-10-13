package generadorDtos.generadores;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import generadorDtos.generadores.comprobaciones.Comprobador;
import generadorDtos.generadores.rellenadores.IRellenador;
import generadorDtos.generadores.rellenadores.Rellenador;


public class GeneradorRellenadorReflexion3 {

	/**
	Comprobador comprobador = new Comprobador();
	IRellenador rellenador= new Rellenador();
	
	
	
	
	public GeneradorRellenadorReflexion3()
	{
		super();
		// TODO Auto-generated constructor stub
	}


	public GeneradorRellenadorReflexion3(IRellenador rellenador)
	{
		super();
		this.rellenador = rellenador;
	}


	public <T> T generaRellenador(Class<T> clase) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
		
		
		if(comprobador.esTipoPrimitivo(clase))
		{
			System.out.println("field es primitivo "+ clase);
			valorASignado= rellenador.rellenaTipoPrimitivo(clase);
			
			
		}
		else if(comprobador.esColeccion(clase))
		{
			valorASignado= rellenaLista(clase);
		}
		else
		{
			System.err.println(clase);
			//System.exit(-1);
			try {
				valorASignado=generaRellenador(clase);
			} catch (InstantiationException | IllegalAccessException | InvocationTargetException
					| NoSuchMethodException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		T obj = clase.newInstance();
		
		System.out.println("nuevo objeto "+ obj);
		
		 Stream<Field> camposInstanciables = Arrays.stream(clase.getDeclaredFields());
        // .filter(field -> !Modifier.isStatic(field.getModifiers())) 
         //.filter(field -> !field.getType().isPrimitive() 
        		// && !field.getType().isInterface() 
        	//	 && !Modifier.isAbstract(field.getType().getModifiers())); // Saltar campos de tipos primitivos y no instanciables

		
		//for(Field field: camposInstanciables.)
		 camposInstanciables.forEach(field->
		 {
			System.out.println("field "+field.toString());
            field.setAccessible(true);

            Object valorASignado=null;
		
			
			 try {
				field.set(obj, valorASignado);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		}
		);
		return obj;
	}
	
	
	public <T> List<T> rellenaLista(Field field)
	{
		List<T> l = new ArrayList<>();
		
		Type genericType = field.getGenericType();
		ParameterizedType parameterizedType = (ParameterizedType) genericType;
		Type[] types = parameterizedType.getActualTypeArguments();
		
		
		try {
			T elemLista = generaRellenador((Class<T>)types[0]);
			l.add(elemLista);
		} catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException
				| SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
		
	}


	public Comprobador getComprobador()
	{
		return comprobador;
	}


	public void setComprobador(Comprobador comprobador)
	{
		this.comprobador = comprobador;
	}


	public IRellenador getRellenador()
	{
		return rellenador;
	}


	public void setRellenador(IRellenador rellenador)
	{
		this.rellenador = rellenador;
	}
	
	
	*/
	

}
