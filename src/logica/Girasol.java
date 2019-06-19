package logica;

/**
 * Declaración de la clase de planta Girasol
 * @author Marina Fernández
 */
public class Girasol extends Plantas {

    /**
     * Constructor de la clase Girasol
     */
    public Girasol() {
        
        super();
        super.setPuntosAtaque(0); //No hace daño
        super.setCoste(20); //Cuesta 20 soles colocarlo
        super.setResistencia(1); //Tiene un punto de resistencia
        super.setAccion(2); //
        super.setTurnos(0); //Cuenta cuantos turnos está en el tablero colocado
    }
    
    /**
     * Método que hace a los girasoles crear soles
     * @param soles
     * @return soles
     */
    public int generarSol(int soles){ 
        return soles = soles + 10;
    }

    
    /** Método que genera soles
     * @param juego
    */
    @Override
    public void actua(Juego juego) {
            if (getTurnos()!= 0 && getTurnos() % getAccion() == 0){
                juego.getPartida().setSoles(generarSol(juego.getPartida().getSoles() ));
        }
    }
}