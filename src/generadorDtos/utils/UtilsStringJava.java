package generadorDtos.utils;

import java.util.List;

public class UtilsStringJava {
	 public static String creaGet(String obj, String atrib) {
		    return String.valueOf(obj) + ".get" + UtilsStringFormat.toClase(atrib) + "()";
		  }
		  
		  public static String creaGet(String obj, List<String> atribs) {
		    return creaGet(obj, atribs, 0);
		  }
		  
		  public static String creaGet(String obj, List<String> atribs, int from) {
		    if (from < atribs.size())
		      return creaGet(creaGet(obj, atribs.get(from)), atribs, from + 1); 
		    return obj;
		  }
		  
		  public static String creaGet(String obj, String atrib, String from) {
		    return String.valueOf(obj) + ".get" + UtilsStringFormat.toClase(atrib) + "(" + from + ")";
		  }
		  
		  public static String creaGetKey(String obj, String key, boolean conComillas) {
		    String comillas = "";
		    if (conComillas)
		      comillas = "\""; 
		    return String.valueOf(obj) + ".get" + "(" + comillas + key + comillas + ")";
		  }
		  /**
		  public static String creaGetKey(String obj, String key, boolean conComillas, String casting) {
		    if (!UtilsStringComprobaciones.isNullOrEmpty(casting))
		      return "(" + casting + ")" + creaGetKey(obj, key, conComillas); 
		    return creaGetKey(obj, key, conComillas);
		  }
		  */
		  public static String creaSet(String obj, String atrib, String value) {
		    return String.valueOf(obj) + ".set" + UtilsStringFormat.toClase(atrib) + "(" + value + ")";
		  }
		  
		  public static String declaraVarTipo(String tipo) {
		    return String.valueOf(UtilsStringFormat.toClase(tipo)) + " " + UtilsStringFormat.toVar(tipo);
		  }
		  
		  public static String declaraVarTipo(String tipo, String valor) {
		    return String.valueOf(UtilsStringFormat.toClase(tipo)) + " " + UtilsStringFormat.toVar(valor);
		  }
		  
		  public static String declaraConstruyeVarTipo(String tipo) {
		    return String.valueOf(declaraVarTipo(tipo)) + " = new " + UtilsStringFormat.toClase(tipo) + "();";
		  }
		  
		  public static String declaraVarTipoYAsigna(String tipo, String asignacion) {
		    return String.valueOf(declaraVarTipo(tipo)) + " =  " + asignacion;
		  }
		  
		  public static String declaraVarTipoYAsigna(String tipo, String nombre, String asignacion) {
		    return String.valueOf(declaraVarTipo(tipo, nombre)) + " =  " + asignacion;
		  }
		  
		  public static String dameTipoDeTC(String s) {
		    if (s.contains("[]"))
		      return "List<" + UtilsStringFormat.toClase(s.replace("[]", "")) + ">"; 
		    return UtilsStringFormat.toClase(s);
		  }
		  
		  public static String declaraLoggerDeClase(String nClase) {
		    if (!nClase.endsWith(".class"))
		      nClase = String.valueOf(nClase) + ".class"; 
		    return "private static final Logger LOGGER = LoggerFactory.getLogger(" + nClase + ");";
		  }
		  
		  public static String declaraClase(String nClase, boolean llave) {
		    StringBuffer sb = new StringBuffer();
		    sb.append("public  class ")
		      .append(nClase)
		      .append(llave ? "{" : "");
		    return sb.toString();
		  }
}
