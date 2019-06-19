package logica;

/**
 * Declaración de la clase de zombie Común
 * @author Marina Fernández
 */
public class ZombieComun extends Zombies {

    /**
     * Constructor de la clase ZombieComun
     */
    public ZombieComun() {
        super();
        super.setVelocidad(2); //Se mueve 2 casillas cada turno
        super.setPuntosAtaque(1); //Hace un punto de daño a las plantas
        super.setResistencia(5); //Tiene 2 puntos de resistencia
        super.setTurnos(0); //Cuenta cuantos turnos está en el tablero colocado
    }
}