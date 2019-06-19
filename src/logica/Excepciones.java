package logica;

import presentacion.ExcepcionesJ;
import java.io.Serializable;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** Controla las posibles excepciones que podemos encontrar en el juego 
*/
public class Excepciones implements Serializable {
    
    
    
    /**Constructor de ExcepcionJuego 
     */
    public Excepciones(String string){
    }
    
    
    /** Método que indicará si ya hay una partida creada o si se puede iniciar una nueva
    * @param j partida por crear
    * @return si hay una partida en curso o no
    */
    public boolean partidaCreada(Juego j) {
        return j.getPartida() == null;
        
    }
    
    
    /** Método para comprobar si el nivel introducido es válido
     * @param dificultad las dificultades permitidas en el juego
     * @return si la dificultad no existe
    */
    public boolean nivelValido(String dificultad){
        return dificultad.equals("BAJA") || dificultad.equals("MEDIA") || dificultad.equals("ALTA") || dificultad.equals("IMPOSIBLE");
        
    }
    
    /** Método para comprobar los comandos en cada turno
     * @param comandos los comandos introducidos por el usuario
     * @return si los datos no son válidos
    */
    public boolean comandoCompleto(String[] comandos){
        if (comandos.length == 3) return true; 
        else {
            Excepciones dialog = new Excepciones("");
            return false;
        }
    }
}