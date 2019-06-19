package logica;

import java.io.Serializable;


public class Tablero implements Serializable{
    
    /** Atributo que introduce un personaje en el tablero */
    private Objetos[][] tablero;

    
    /** Constructor de tablero
     * @param x que son las filas
     * @param y que son las columnas
     */
    public Tablero(int x, int y) {
        tablero = new Objetos[y][x];
    }

    public Objetos[][] getTablero() {
        return tablero;
    }
    public Objetos getTableroPos(int x,int y) {
        return tablero[y-1][x-1];
    }
    
    public void setTableroPos(int x,int y, Objetos p ) {
         tablero[y-1][x-1] = p;
    }
    
    public void setTablero(Objetos[][] tablero) {
        this.tablero = tablero;
    }
    
    
    /** Método que añade un personaje al tablero en las coordenadas x, y.
     * @param x las filas del tablero
     * @param y las columnas del tablero
     * @param p el personaje en el tablero
     */
    public void addT(int x, int y, Objetos p){
        tablero[y-1][x-1] = (Objetos) p;
    }
    
    
    
    /** Método que mide la longitud de la variable x
     * @return la longitud de la variable x
     */
    public int lonX(){
        return tablero[1].length;
    }
    
    /** Método que mide la longitud de la variable y
     * @return la longitud de la variable y
     */
    public int lonY(){
        return tablero.length;
    }
    
}
