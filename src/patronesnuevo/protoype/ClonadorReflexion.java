package patronesnuevo.protoype;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClonadorReflexion
{

	public static void main(String[] args)
	{
		Clonado clonado = new Clonado();
		
		ClonadorReflexion clonador= new ClonadorReflexion();
		
		
		System.out.println(clonador.creaClonPrototype(clonado));
	}
	
	
	public Object creaClonPrototype(Object obj)
	{
		
		Class clase = obj.getClass();
		try
		{
			Constructor constructor = clase.getConstructor(clase);
			
			return constructor.newInstance(obj);
		} catch (NoSuchMethodException | SecurityException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
