package logica;

import java.io.Serializable; //Convierte un objeto en en una secuencia de bytes que pueden ser posteriormente leídos para restaurar el objeto original

/**
 * Declaración de la clase abstracta Objetos
 * @author Marina Fernández
 */
public abstract class Objetos implements Serializable{
    
    private int x; //Fila
    private int y; //Columna
    private int resistencia; //Puntos de resistencia de las plantas y zombies
    private int puntosAtaque; //Puntos de ataque que tienen las plantas y zombies
    private int turnos; //Turnos que lleva una planta o zombie colocado en el tablero

    /**
     * Constructor de la clase Objetos
     */
    public Objetos() {
    
    }

    /**
     * Devuelve el eje x donde se colcoarán los objetos
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * Devuelve el eje y donde se colcoarán los objetos
     * @return y
     */
    public int getY() {
        return y;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public int getTurnos() {
        return turnos;
    }

    /**
     * Mofdifica el eje x donde se colocarán los objetos
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Modifica el eje y donde se coocarán los objetos
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public void setTurnos(int turnos) {
        this.turnos = turnos;
    }
    
    /**
     * Método que indica si un objeto ha llegado a 0 de resistencia y por lo tanto hay que borrar la jlabel
     * @return resistencia
     */
    public boolean borrar(){
       return resistencia == 0;
    }

    public abstract void actua(Juego j);
    
    public abstract void Ataque(Objetos p);
}