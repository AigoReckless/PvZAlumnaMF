package logica;

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
}