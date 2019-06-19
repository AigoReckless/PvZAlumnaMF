
package logica;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** Esta clase controlará el efecto de la planta tipo LanzaGuisantes dentro de la partida
*/
public class LanzaGuisantes extends Plantas {
    
    /** Constructor de LanzaGuisantes
     */
    public LanzaGuisantes() {
        super();
        /** Tiene 3 unidades de vida*/
        super.setResistencia(3);
        /** Cuesta 50 soles*/
        super.setCoste(50);
        /** Lanza un guisante por turno*/
        super.setAccion(1);
        /** Le resta una vida al enemigo por lanzamiento*/
        super.setPuntosAtaque(1);
        super.setExcepcion(new ExcepcionPlanta());
        /** Atributo que cuenta los turnos que lleva el LanzaGuisantes en la partida*/
        super.setTurnos(-1);
    }

    /** Método que permite atacar al LanzaGuistantes
     * @param p personaje, en este caso el LanzaGuisantes
     */ 
    public void Ataque(Objetos p) {
        p.setResistencia(p.getResistencia()-super.getPuntosAtaque());
    }

    

    /** Método que permite plantar LanzaGuisantes
     * @param x coordenada x dentro del tablero donde se quiere situar 
     * @param y coordenada y dentro del tablero donde se quiere situar
     * @param j partida en curso
     */
    @Override
    public void colocarPlanta(int x, int y,Juego j) {
        if (getExcepcion().dentroTablero(x, y, j.getPartida().getTablero().lonX(), j.getPartida().getTablero().lonY()) && getExcepcion().casillaOcupada( j.getPartida().getTablero().getTableroPos(x, y)) && getExcepcion().costePosible(this.getCoste(), j.getPartida().getSoles())){
            j.getPartida().getTablero().addT(x, y, this);        
            j.getPartida().setSoles(j.getPartida().getSoles()-getCoste());
            j.getPartida().setTurno(j.getPartida().getTurno()+1);    
        }
    }

    /**Método que controla el ataque del LanzaGuisantes
     * @param j partida en curso
     */
    @Override
    public void actua(Juego j) {
        int salir =0;
        if (getTurnos() != 0 && getTurnos() % getAccion() ==0){
            for (int i = super.getX(); i<j.getPartida().getTablero().getTablero()[super.getY()-1].length && salir != 1; i++){
                
                    if ( j.getPartida().getTablero().getTableroPos(i+1,super.getY()) instanceof Zombies && !j.getPartida().getTablero().getTableroPos(i+1,super.getY()).borrar()){
                        Ataque(j.getPartida().getTablero().getTableroPos(i+1,super.getY()) );
                        salir = 1;
                    }
            }
        }
    }

}
