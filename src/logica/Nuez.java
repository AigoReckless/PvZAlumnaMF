package logica;

/**
 * Declaración de la clase de planta Nuez
 * @author Marina Fernández
 */
public class Nuez extends Plantas {

    /**
     * Constructor de la clase Nuez
     */
    public Nuez() {
        super();
        super.setCoste(50); //Cuesta 50 soles
        super.setResistencia(10); //Tiene 10 puntos de resistencia
        super.setPuntosAtaque(0); //No hace daño
        super.setTurnos(0); //Cuenta cuantos turnos lleva colocado en el tablero
        super.setAccion(0); //No realiza acciones por turno
        
        /** Atributo que llama a las posibles excepciones que puede tener este personaje */
        super.setExcepcion(new ExcepcionPlanta());
    }
}