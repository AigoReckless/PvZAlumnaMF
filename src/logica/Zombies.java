package logica;

/**
 * Declaración de la clase abstracta Zombies
 * @author Marina Fernández
 */
public abstract class Zombies extends Objetos {
    
    private int velocidad;
    
    /**
     * Constructor de la clase Zombie
     */
    public Zombies() {
        super();
    } 
    
    /**
     * Método set de velocidad que modifica la velocidad a la que se mueve el zombie
     * @param velocidad
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }    

    /**
     * Método get de velocidad que devuelve la velocidad a la que se mueve el zombie
     * @return velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }
    
    
    /**
     * Método para que los zombies ataquen a las plantas
     * @param ataque
     */
    @Override
    public void Ataque(Objetos ataque) {
        ataque.setResistencia(ataque.getResistencia() - super.getPuntosAtaque());
    }
    
    /**
     * Método para 
     * @param juego
     */
    @Override
    public void actua(Juego juego) {
        
        if (juego.getPartida().getTablero().getTableroPos(super.getX() - 1, super.getY()) == null) {
            if (getTurnos() % getVelocidad() != 0){
            } else {
                juego.getPartida().getTablero().setTableroPos(super.getX(), super.getY(), null);
                juego.getPartida().getTablero().setTableroPos(super.getX() - 1, super.getY(), this);
                this.setX(super.getX() - 1);
            }
        }
        else {
            if ((!(juego.getPartida().getTablero().getTableroPos(super.getX() - 1, super.getY() ) instanceof Plantas) || this.getX() == 1) || juego.getPartida().getTablero().getTableroPos(super.getX()-1, super.getY() ).borrar() ){
                //Ooperador instanceof = conocer si un objeto es de un tipo determinado
            } else {
                Ataque(juego.getPartida().getTablero().getTableroPos(super.getX() - 1, super.getY() ));
            }
        }
    }
}