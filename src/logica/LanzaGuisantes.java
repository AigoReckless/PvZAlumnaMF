package logica;

/**
 * Declaración de la clase de planta LanzaGuisantes
 * @author Marina Fernández
 */
public class LanzaGuisantes extends Plantas {
    
    /**
     * Constructor de la clase LanzaGuisantes
     */
    public LanzaGuisantes() {
        super();
        super.setCoste(50); //Cuesta 50 soles colocarlo
        super.setResistencia(3); //Tiene 3 puntos de resistencia
        super.setPuntosAtaque(1); //Hace un punto de daño
        super.setTurnos(0); //Cuenta cuantos turnos está en el tablero colocado
        super.setAccion(1); //Realiza una acción por turno
        
        super.setExcepcion(new ExcepcionPlanta());  
    }
}