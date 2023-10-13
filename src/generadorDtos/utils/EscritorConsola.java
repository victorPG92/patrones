package generadorDtos.utils;


public class EscritorConsola extends Escritor {
  public Escritor abrirEscritor(String nClase) {
    return this;
  }
  
  public void escribirLinea(String s, int numTab) {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < numTab; i++)
      sb.append("\t"); 
    System.out.println(String.valueOf(sb.toString()) + s);
  }
  
  public void escribir(String s) {
    System.out.print(s);
  }
  
  public void cerrarEscritor() {}
  
  public boolean estaAbierto() {
    return true;
  }
  
  public TipoEscritor getTipo() {
    return TipoEscritor.CONSOLA;
  }
  
  public Escritor creaCopia() {
    return new EscritorConsola();
  }
}

