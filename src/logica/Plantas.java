package logica;

/**
 * Declaración de la clase abstracta Plantas
 * @author Marina Fernández
 */
public abstract class Plantas extends Objetos {

    private int coste; //Girasoles que cuesta colocar una planta
    private int accion; //Acción que realiza cada planta por turno
    
    
    
    
    /** Atributo que llama a las posibles excepciones que puede tener este personaje */
    private ExcepcionPlanta excepcion = new ExcepcionPlanta();
    
    
    
    
    
    
    /**
     * Constructor de la clase abstracta Plantas
     */
    public Plantas() {
        super();
    }

    public int getCoste() {
        return coste;
    }

    public int getAccion() {
        return accion;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public void setAccion(int accion) {
        this.accion = accion;
    }
    
    
    /** Método que permite atacar al LanzaGuistantes
     * @param p personaje, en este caso el LanzaGuisantes
     */ 
    @Override
    public void Ataque(Objetos p) {
        p.setResistencia(p.getResistencia()-super.getPuntosAtaque());
    }

    
    /** Método que permite plantar LanzaGuisantes
     * @param x coordenada x dentro del tablero donde se quiere situar 
     * @param y coordenada y dentro del tablero donde se quiere situar
     * @param j partida en curso
     */
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
    

    
    
  
    public ExcepcionPlanta getExcepcion() {
        return excepcion;
    }

    public void setExcepcion(ExcepcionPlanta excepcion) {
        this.excepcion = excepcion;
    }
    
    
   
}
