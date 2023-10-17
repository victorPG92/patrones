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


public class GeneradorRellenadorReflexion2 {

	Comprobador comprobador = new Comprobador();
	IRellenador rellenador= new Rellenador();
	
	
	private boolean subnivelListas=true;
	
	
	
	public GeneradorRellenadorReflexion2()
	{
		super();
		// TODO Auto-generated constructor stub
	}


	public GeneradorRellenadorReflexion2(IRellenador rellenador)
	{
		super();
		this.rellenador = rellenador;
	}


	public <T> T generaRellenador(Class<T> clase) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
		return generaRellenador(clase, true);
	}
		
	public <T> T generaRellenador(Class<T> clase,boolean obtenerOrigenDto) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
		
		System.out.println("INICIO 2 ");
		System.out.println("generaRellenador clase "+clase.getSimpleName()+" origen"+rellenador.getOrigen());
		if(comprobador.esTipoPrimitivo(clase) || comprobador.esColeccion(clase))
		{
			System.err.println("no se rellena");
			return null;
		}
		
		if(!comprobador.tieneConstructorPorDefecto(clase))
		{
			System.err.println("NO Se puede instanciar ");
			return null;
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
			if(comprobador.esTipoPrimitivo(field))
			{
				System.out.println("field es primitivo "+ field.getType());
				valorASignado= rellenador.rellenaTipoPrimitivo(field);
				/*String nombreSetter= "set"+Util.capitalize(field.getName());
				
				System.out.println("field es primitivo nombreSetter"+ nombreSetter);
				System.out.println("field es primitivo valorASignado"+ valorASignado);

				obj.getClass().getDeclaredMethod(nombreSetter, field.getType()).invoke(obj,valorASignado );
				*/
				
			}
			else if(comprobador.esColeccion(field))
			{
				System.out.println("es una coleccion "+ field.getType());
				
				Object origenOld= rellenador.getOrigen();
				List origenListado = rellenador.getOrigenListado(field);
				valorASignado= rellenaLista(field,origenListado);
				rellenador.setOrigen(origenOld);
			}
			else
			{
				System.err.println("No es ni tipo primitivo ni coleccion"+field.getType());
				//System.exit(-1);
				try {
					
					Object origenOld= rellenador.getOrigen();
					if(obtenerOrigenDto)
					{
						rellenador.setOrigen(rellenador.getOrigen(field));	
					}
					valorASignado=generaRellenador(field.getType());
					
					rellenador.setOrigen(origenOld);
				} catch (InstantiationException | IllegalAccessException | InvocationTargetException
						| NoSuchMethodException | SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
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
	
	
	public <T> List<T> rellenaLista(Field field, List<Object> origenListado)
	{
		
		List<T> l;
		Class<?> tipoLista = field.getType();
		if(tipoLista.equals(List.class))
		{
			l =  new ArrayList<>();
		}
		l =  new ArrayList<>();
		
		
		Type genericType = field.getGenericType();
		ParameterizedType parameterizedType = (ParameterizedType) genericType;
		Type[] types = parameterizedType.getActualTypeArguments();
		
		
		try {
			
			System.out.println("rellenaLista origenListado "+ origenListado);
			for(Object origen: origenListado)
			{
				
				System.out.println("rellenaLista origenListado for"+ origenListado);
				//if(subnivelListas)			origen= 
				rellenador.setOrigen(origen);
				System.out.println("rellenaLista bucle origen"+origen);
				T elemLista = generaRellenador((Class<T>)types[0],true);///////////////////////////////////////////////////////////
				l.add(elemLista);
			}
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


	public boolean isSubnivelListas()
	{
		return subnivelListas;
	}


	public void setSubnivelListas(boolean subnivelListas)
	{
		this.subnivelListas = subnivelListas;
	}
	
	
	
	

}
