package logica;

/**
 * Declaración de la clase de zombie Caracubo
 * @author Marina Fernández
 */
public class Caracubo extends Zombies {
    
    /**
     * Constructor de la clase Caracubo
     */
    public Caracubo() {
        super();
        super.setPuntosAtaque(1); //Hace un punto de daño a las plantas
        super.setTurnos(0); //Cuenta cuantos turnos está en el tablero colocado
        super.setVelocidad(4); //Se mueve 1 casilla cada 4 turnos
        super.setResistencia(8); //Tiene 8 puntos de resistencia
    }
}