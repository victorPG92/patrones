package generadorDtos.utils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public abstract class Escritor {
  
  private int tab;
  
  public void escribirLinea(String s) {
    escribirLinea(s, 0);
  }
  
  public void escribirLinea() {
    escribirLineaVacia();
  }
  
  public void escribirLineaVacia() {
    escribirLinea("");
  }
  
  public void escribirLinea(String s, int numTab) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < numTab; i++)
      sb.append("\t"); 
    sb.append(s).append("\n");
    escribir(sb.toString());
  }
  
  public void escribirLineaTab(String s) {
    escribirLinea(s, this.tab);
  }
  
  public void close() {
    cerrarEscritor();
  }
  
  public boolean copiaDe(String n) {
    try {
      Path path = Paths.get(n, new String[0]);
      Stream<String> stream = Files.lines(path);
      stream.forEach(s -> escribirLinea(s));
      stream.close();
      return true;
    } catch (Exception e) {
      System.err.println("Fallo con fichero " + n);
      return false;
    } 
  }
  
 
  
  public int getTab() {
    return this.tab;
  }
  
  public void setTab(int tab) {
    this.tab = tab;
  }
  
  public void aumentaTab() {
    this.tab++;
  }
  
  public void reduceTab() {
    this.tab--;
  }
  
  public abstract Escritor abrirEscritor(String paramString);
  
  public abstract boolean estaAbierto();
  
  public abstract void escribir(String paramString);
  
  public abstract void cerrarEscritor();
  
  public abstract TipoEscritor getTipo();
  
  public abstract Escritor creaCopia();
}

