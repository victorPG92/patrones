package generadorDtos.utils;

public class UtilsStringFormat {
	 public static String toClase(String s) {
		    if ((((s == null) ? 1 : 0) | ((s.length() == 0) ? 1 : 0)) != 0)
		      return s; 
		    return String.valueOf(Character.toUpperCase(s.charAt(0))) + s.substring(1);
		  }
		  
		  public static String toVar(String s) {
		    if ((((s == null) ? 1 : 0) | ((s.length() == 0) ? 1 : 0)) != 0)
		      return s; 
		    return String.valueOf(Character.toLowerCase(s.charAt(0))) + s.substring(1);
		  }
}
