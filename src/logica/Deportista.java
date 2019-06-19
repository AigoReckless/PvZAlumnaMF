package logica;

/**
 * Declaración de la clase de zombie Deportista
 * @author Marina Fernández
 */
public class Deportista extends Zombies {
    
    /**
     * Constructor de la clase Deportista
     */
    public Deportista() {
        super();
        super.setResistencia(2); //Tiene 2 puntos de resistencia
        super.setPuntosAtaque(1); //Hace un punto de daño a las plantas
        super.setVelocidad(1); //Se mueve 1 casilla cada turno
        super.setTurnos(0); //Cuenta cuantos turnos está en el tablero colocado
    }  
}