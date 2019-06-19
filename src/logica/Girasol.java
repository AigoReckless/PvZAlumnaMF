package logica;

/**
 * Declaración de la clase Girasol
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
    
    /** Método que controla los soles que van generando los girasoles a lo largo de la partido
     * @param soles los soles que hay en la partida
     * @return la ganancia que se acumula cada vez que el girasol da nuevos soles
    */
    public int ganaSoles(int soles){ 
        return soles += 10;
    }
    
    /** Este método no afecta a esta planta ya que los girasoles no atacan
     * @param p personaje, en este caso el girasol
     */
    @Override
    public void Ataque(Objetos p) {
    }
    
    
 
    /** Método que permite plantar Girasoles
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
    
    
    
    /** Método que genera soles 
     * @param j partida en curso
    */
    public void actua(Juego j) {
            if (getTurnos()!= 0 && getTurnos() % getAccion() ==0){
                j.getPartida().setSoles(ganaSoles(j.getPartida().getSoles()));
                
        }
    }
}