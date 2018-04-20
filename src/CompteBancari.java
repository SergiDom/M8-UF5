/**
 * 
 * Aquesta classe defineix les operacions del compte bancari del usuari
 * 
 * @author Sergi
 * @version 2.1_ACT09
 */
public class CompteBancari {

    /**
     * Atribut amb el que es guardara el nom del propietari del compte bancari
     */
    private String nom;
    
    /**
     * Atribut amb el que es guardara el numero secret del compte bancari
     */
    private int numSecret;
    
    /**
     * Atribut amb el que es guardarà el saldo inicial del compte bancari
     */
    private static float saldoInicial = (float) 100.0;
    
    /**
     * Atribut amb el que es guardarà el saldo del compte bancari
     */
    private float saldo;

    
    /**
     * Constructor de la classe CompteBancari per crear un compte bancari
     * @param nom Simbol associat a l'operació que s'ha realitzat
     * @param numSecret Simbol associat a l'operació que s'ha realitzat
     */
    public CompteBancari(String nom, int numSecret) {
        this.nom = nom;
        this.numSecret = numSecret;
        this.saldo = CompteBancari.saldoInicial;
    }

    /**
     * Metode que permet obtenir el nom del propietari del Compte Bancari
     * @return Retorna el valor del atribut nom
     */
    public String getNom() {
        return this.nom;
    }
    
    /**
    * Metode que permet obtenir el numero secret del Compte Bancari
    * @return Retorna el valor del atribut num secret
    */
    public int getNumSecret() {
        return this.numSecret;
    }

    /**
     * Metode que permet obtenir el saldo del Compte Bancari
     * @return Retorna el valor del atribut saldo
     */
    public float consultarSaldo() {
        return this.saldo;
    }

    
    /**
     * Metode que permet obtenir el saldo incicial del compte bancari
     * @return Retorna el valor del atribut saldo inicial
     */
    public static float getSaldoInicial() {
        return CompteBancari.saldoInicial;
    }

    /**
     * Metode que permet establir el saldo inicial del compte bancari
     * @param saldoIncial Simbol associat a l'operació que s'ha realitzat
     */
    public static void setSaldoInicial(float saldoIncial) {
        CompteBancari.saldoInicial = saldoIncial;
    }
    
    /**
     * Metode que permet mostrar les dades amb una frase amb sentit
     * @return Retorna les dades del compte bancari
     */
    public String mostrarDades() {
        return ("El propietari es diu: " + this.nom + " amb número secret: "
                + this.numSecret + ". El saldo actual es: " + this.saldo);
    }

    /**
     * Metode que permet ingressar una quantitat al compte bancari
     * @param quantitat Simbol associat a l'operació que s'ha realitzat
     * @return Retorna el valor del atribut resultat
     */
    public boolean ingressar(float quantitat) {
        boolean resultat = false;
        if (quantitat >= 0) {
            this.saldo = this.saldo + quantitat;
            resultat = true;
        }
        return resultat;
    }

    /**
     * Metode que permet extreure una quantitat del compte bancari
     * @param quantitat Simbol associat a l'operacio que s'ha realitzat
     * @return Retorna el valor del atribut resultat
     */
    public boolean extreure(float quantitat) {
        boolean resultat = false;
        if (quantitat >= 0) {
            this.saldo = this.saldo - quantitat;
            resultat = true;
        }
        return resultat;
    }
    
    public String saludo2(){
        return("Hola señor/a 2");
    }
}
