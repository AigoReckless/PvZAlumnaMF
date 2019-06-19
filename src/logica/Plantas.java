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

    /**
     * Método para colocar las plantas en el tablero
     * @param fila
     * @param columna
     * @param partida
     */
    public abstract void colocarPlanta(int fila, int columna, Juego partida);

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public ExcepcionPlanta getExcepcion() {
        return excepcion;
    }

    public void setExcepcion(ExcepcionPlanta excepcion) {
        this.excepcion = excepcion;
    }
    
    
   
}
