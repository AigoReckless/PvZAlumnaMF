package logica;

import java.io.Serializable;

/**
 * Declaración de la clase Tablero
 * @author Marina Fernández
 */
public class Tablero implements Serializable {
    //Convierte un objeto en en una secuencia de bytes que pueden ser posteriormente leídos para restaurar el objeto original
    
    /** Atributo que introduce un personaje en el tablero */
    private Objetos[][] tablero;

    
    /** Constructor de tablero
     * @param fila que son las filas
     * @param columna que son las columnas
     */
    public Tablero(int fila, int columna) {
        tablero = new Objetos[columna][fila];
    }

    public Objetos[][] getTablero() {
        return tablero;
    }
    public Objetos getTableroPos(int fila,int columna) {
        return tablero[columna-1][fila-1];
    }
    
    public void setTableroPos(int fila,int columna, Objetos p ) {
         tablero[columna-1][fila-1] = p;
    }
    
    public void setTablero(Objetos[][] tablero) {
        this.tablero = tablero;
    }
    
    
    /** Método que añade un personaje al tablero en las coordenadas fila, columna.
     * @param fila las filas del tablero
     * @param columna las columnas del tablero
     * @param p el personaje en el tablero
     */
    public void addT(int fila, int columna, Objetos p){
        tablero[columna-1][fila-1] = (Objetos) p;
    }
    
    
    
    /** Método que mide la longitud de la variable fila
     * @return la longitud de la variable fila
     */
    public int lonfila(){
        return tablero[1].length;
    }
    
    /** Método que mide la longitud de la variable columna
     * @return la longitud de la variable columna
     */
    public int loncolumna(){
        return tablero.length;
    }
    
}
