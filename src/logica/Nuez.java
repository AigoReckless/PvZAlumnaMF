
package logica;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** Esta clase controlará el efecto de la planta tipo Nuez dentro de la partida
*/
public class Nuez extends Plantas {

    /** Constructor de Nuez
     */
    public Nuez() {
        super();
        /** Tiene 3 unidades de vida*/
        super.setResistencia(10);
        /** Cuesta 50 soles*/
        super.setCoste(50);
        /** Lanza un guisante por turno*/
        super.setAccion(0);
        /** Le resta una vida al enemigo por lanzamiento*/
        super.setPuntosAtaque(0);
        /** Atributo que llama a las posibles excepciones que puede tener este personaje */
        super.setExcepcion(new ExcepcionPlanta());
        /** Atributo que cuenta los turnos que lleva el LanzaGuisantes en la partida*/
        super.setTurnos(-1);
    }
    
    
    /** Método que permite plantar una Nuez
     * @param x coordenada x dentro del tablero donde se quiere situar 
     * @param y coordenada y dentro del tablero donde se quiere situar
     * @param j partida en curso
     */
    @Override
    public void colocarPlanta(int x, int y, Juego j) {
        if (getExcepcion().dentroTablero(x, y, j.getPartida().getTablero().lonX(), j.getPartida().getTablero().lonY()) && getExcepcion().casillaOcupada( j.getPartida().getTablero().getTableroPos(x, y)) && getExcepcion().costePosible(this.getCoste(), j.getPartida().getSoles())){
            j.getPartida().getTablero().addT(x, y, this);        
            j.getPartida().setSoles(j.getPartida().getSoles()-getCoste());
            j.getPartida().setTurno(j.getPartida().getTurno()+1);    
        }
    }

    /** Este método no afecta a esta planta ya que las nueces necesitan un control para el ataque
     * @param j el juego en curso
     */

    public void actua(Juego j) {
    }

    /** Este método no afecta a esta planta ya que las nueces no atacan
     * @param p el personaje, en este caso una nuez
     */
    public void Ataque(Objetos p) {
        
    }

    
    
    
}
