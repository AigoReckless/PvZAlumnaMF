package logica;

import java.io.Serializable;

/**
 * 
 * @author Marina Fernández
 */
public class Juego implements Serializable{
    /** Atributo para controlar los comandos introducidos por teclado de la partida*/
    private Comandos comandos;
    /** Atributo que indica la partida a jugar*/
    private Partida partida;
    /** Atributo que controla las excepciones que puede tener el juego*/
    private Excepciones excepcionJuego;
    /** Atributo que cuenta el número de Zombies que aparecerán en la partida*/
    private int totalEnemigos;
    /** Atributo que cuenta los turnos que tendrá la partida en total*/
    private int turnosTotales;
    /** Atributo que controla el turno anterior al actual*/
    private int turnoAnt;
    /** Atributo que indica el jugador jugando actualmente la partida*/
    private Jugador jugador;
    /** Atributo que indica cuándo se gana la partida*/
    private boolean fin;
    /** Atributo que indica cuándose pierde la partida*/
    private boolean finMalo;


    /** Constructor de Juego
     * @param comandos comandos del juego
     * @param excepcionJuego excepciones del juego
     */
    public Juego(Comandos comandos, Excepciones excepcionJuego) {
        this.comandos = comandos;
        this.excepcionJuego = excepcionJuego;
        fin = false;
        finMalo=false;
    }

    public Comandos getComandos() {
        return comandos;
    }

    public void setComandos(Comandos comandos) {
        this.comandos = comandos;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public Excepciones getExcepcionJuego() {
        return excepcionJuego;
        
    }

    public int getTotalEnemigos() {
        return totalEnemigos;
    }

    public void setTotalEnemigos(int totalEnemigos) {
        this.totalEnemigos = totalEnemigos;
    }
    
    public int getTurnosTotales() {
        return turnosTotales;
    }

    public void setTurnosTotales(int turnosTotales) {
        this.turnosTotales = turnosTotales;
    }
 
    public void setExcepcionJuego(Excepciones excepcionJuego) {
        this.excepcionJuego = excepcionJuego;
    }

    public void setFinMalo(boolean finMalo) {
        this.finMalo = finMalo;
    }
    

    public int getTurnoAnt() {
        return turnoAnt;
    }

    public void setTurnoAnt(int turnoAnt) {
        this.turnoAnt = turnoAnt;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public void setFin(boolean fin) {
        this.fin = fin;
    }
    
    /** Método que indica si se pierde la partida
     * @return devuelve si se ha perdido la partida
    */
    public boolean isFinMalo() {
        return finMalo;
    }
  
    /** Método que indica si se gana la partida
    * @return devuelve si se ha ganado la partida
    */
    public boolean isFin() {
        return fin;
    }
    
    /** Método que actualiza la partida a cada turno que pasa
     * @param j partida en curso
    */
    public void actualizar(Juego j){
        if (j.getPartida() != null){
                if (turnoAnt != j.getPartida().getTurno()){
                    turnoAnt = j.getPartida().getTurno();
                    for (int i =0; i< j.getPartida().getTablero().loncolumna();i++){
                        for (int p =0 ; p < j.getPartida().getTablero().lonfila() ; p++){
                            if (j.getPartida().getTablero().getTableroPos(p+1, i+1) != null && !j.getPartida().getTablero().getTableroPos(p+1, i+1).borrar()){
                                j.getPartida().getTablero().getTableroPos(p+1, i+1).setTurnos(j.getPartida().getTablero().getTableroPos(p+1, i+1).getTurnos()+1);
                                j.getPartida().getTablero().getTableroPos(p+1, i+1).actua(j);
                            }
                            if (j.getPartida().getTablero().getTableroPos(p+1, i+1) != null && j.getPartida().getTablero().getTableroPos(p+1, i+1).borrar()){
                                j.getPartida().getTablero().setTableroPos(p+1, i+1,null);
                            }
                        }
                    }
                    if (getPartida().getTurno()>getPartida().getTurnoInicial() && totalEnemigos < getPartida().getEnemigos() ){
                        int zombiesRonda = (int) (Math.random() * getPartida().getTablero().loncolumna());
                        int zombiesGenerados=0;
                        int tipoZombie = (int) (Math.random()*3+1);
                        for (int i = 0; i<zombiesRonda; i++){
                            int pos =(int) (Math.random() * getPartida().getTablero().loncolumna()) + 1;
                            Zombies z ;
                            switch (tipoZombie) {
                                case 1:
                                    z = new ZombieComun();
                                    break;
                                case 2:
                                    z = new Caracubo();
                                    break;
                                default:
                                    z = new Deportista();
                                    break;
                            }
                            
                            if (getPartida().getTablero().getTableroPos(getPartida().getTablero().lonfila(),pos) == null){
                                getPartida().getTablero().addT(getPartida().getTablero().lonfila(), pos, z);
                                z.setX(getPartida().getTablero().lonfila());
                                z.setY(pos);
                                zombiesGenerados++;
                            }
                        }
                        totalEnemigos += zombiesGenerados;
                    }                      
                }
                for(int i = 1; i<=j.getPartida().getTablero().loncolumna();i++){
                    if (j.getPartida().getTablero().getTableroPos(1, i) != null && j.getPartida().getTablero().getTableroPos(1, i) instanceof Zombies){
                        j.setFinMalo(true);
                    }
                }
        }
        
    }
}
