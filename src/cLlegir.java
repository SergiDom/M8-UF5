import java.io.*;
/**
 * Aquesta classe permet processar dades introduïdes per teclat
 * @author Sergi
 * @version 2.1_ACT09
 */
public class cLlegir
{
    /**
     * Metode que permet obtenir el valor d'un String
     * @return Retorna el valor del atribut sdato 
     */
  public static String dato()
  {
    String sdato = "";
    try
    {
      // Definir un flujo de caracteres de entrada: flujoE
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader flujoE = new BufferedReader(isr);
      // Leer. La entrada finaliza al pulsar la tecla Entrar
      sdato = flujoE.readLine();
    }
    catch(IOException e)
    {
      System.err.println("Error: " + e.getMessage());
    }
    return sdato; // devolver el dato tecleado
  }
  
  /**
   * Metode que permet obtenir el valor d'un Short
   * @return Retorna el valor del atribut Short
   */
  public static short datoShort()
  {
    try
    {
      return Short.parseShort(dato());
    }
    catch(NumberFormatException e)
    {
      return Short.MIN_VALUE; // valor mas pequeño
    }
  }
  

  /**
   * Metode que permet obtenir el valor d'un Int
   * @return Retorna el valor del atribut Integer
   */
  public static int datoInt()
  {
    try
    {
      return Integer.parseInt(dato());
    }
    catch(NumberFormatException e)
    {
      return Integer.MIN_VALUE; // valor m�s peque�o
    }
  }
  
  
  /**
   * Metode que permet obtenir el valor d'un Long
   * @return Retorna el valor del atribut Long
   */
  public static long datoLong()
  {
    try
    {
      return Long.parseLong(dato());
    }
    catch(NumberFormatException e)
    {
      return Long.MIN_VALUE; // valor m�s peque�o
    }
  }
  
  /**
   * Metode que permet obtenir el valor d'un Float
   * @return Retorna el valor del atribut Float
   */
  public static float datoFloat()
  {
    try
    {
      Float f = new Float(dato());
      return f.floatValue();
    }
    catch(NumberFormatException e)
    {
      return Float.NaN; // No es un N�mero; valor float.
    }
  }
  
  /**
   * Metode que permet obtenir el valor d'un Double
   * @return Retorna el valor del atribut Double
   */
  public static double datoDouble()
  {
    try
    {
      Double d = new Double(dato());
      return d.doubleValue();
    }
    catch(NumberFormatException e)
    {
      return Double.NaN; // No es un N�mero; valor double.
    }
  }
} //cLlegir
