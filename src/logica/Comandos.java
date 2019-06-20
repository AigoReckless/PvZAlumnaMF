package logica;

import java.io.Serializable;
import presentacion.ExcepcionesJ;

public class Comandos implements Serializable{
//Convierte un objeto en en una secuencia de bytes que pueden ser posteriormente leídos para restaurar el objeto original

    /**
     * Constructor de la clase Comandos
     */
    public Comandos() {
        
    }

    
    
    
    /** Método que pondrá todos los comandos introducidos por teclado en mayúscula
     * @param comando el comando introducido por el usuario
     * @return dicho comando en mayúscula
     */
    public String todoMayus(String comando){
        return comando.toUpperCase();
    }
    
    /** Método para leer los comandos introducidos por teclado por el usuario
     * @param entrada comando introducido por el usuario
     * @param j partida por iniciar
     */
    public void lecturaComando(String entrada, Juego j){
        entrada = todoMayus(entrada);
        String[] partesEntrada =entrada.split(" ");
        String modo = partesEntrada[0];
        
        Comandos c = j.getComandos();

        ExcepcionesJ dialog;


        if (null == modo)dialog = new ExcepcionesJ(new javax.swing.JFrame(), true,4); 
        /** El comando "L" servirá para plantar un Lanzaguisantes
         */
        else /** El comando "G" servirá para plantar un Girasol
         */ switch (modo) {
            case "G":
                if (j.getExcepcionJuego().comandoCompleto(partesEntrada)){
                    if (j.getPartida() != null){
                        Girasol g = new Girasol();
                        int x = Integer.parseInt(partesEntrada[1]);
                        int y = Integer.parseInt(partesEntrada[2]);
                        g.colocarPlanta(x, y, j);
                        
                        g.setX(x);
                        g.setY(y);
                    }
                }   break;
            case "L":
                if (j.getExcepcionJuego().comandoCompleto(partesEntrada)){
                    if (j.getPartida() != null){
                        LanzaGuisantes l = new LanzaGuisantes();
                        int x = Integer.parseInt(partesEntrada[1]);
                        int y = Integer.parseInt(partesEntrada[2]);
                        l.colocarPlanta(x, y, j);
                        
                        l.setX(x);
                        l.setY(y);
                    }
                }   break;
            
            case "NU":
                if (j.getExcepcionJuego().comandoCompleto(partesEntrada)){
                    if (j.getPartida() != null){
                        Nuez l = new Nuez();
                        int x = Integer.parseInt(partesEntrada[1]);
                        int y = Integer.parseInt(partesEntrada[2]);
                        l.colocarPlanta(x, y, j);
                        
                        l.setX(x);
                        l.setY(y);
                    }
                }   break;
            case "":
                if (j.getPartida() != null){
                    j.getPartida().setTurno(j.getPartida().getTurno()+1);
                }   break;
            default:
                dialog = new ExcepcionesJ(new javax.swing.JFrame(), true,4);
                break; 
        }
    }
    
    /** Método para crear una nueva partida
     * @param j partida a crear
     * @param Dificultad la dificultad deseada por el usuario
     * @param x filas del tablero
     * @param y columnas del tablero
     */
    public void nuevaPartida(Juego j, String Dificultad , int x, int y){
        Tablero t = new Tablero(x,y);

        if (Dificultad.equals("BAJA")){
            Partida p = new Partida(50,0,Dificultad,t,5,10);  
            j.setPartida(p);
        }
        else if (Dificultad.equals("MEDIA")){
            Partida p = new Partida(50,0,Dificultad,t,15,7);
            j.setPartida(p);
        }
        else if (todoMayus(Dificultad).equals("ALTA")){
            Partida p = new Partida(50,0,Dificultad,t,25,5);  
            j.setPartida(p);
        }
        else if (todoMayus(Dificultad).equals("IMPOSIBLE")){
            Partida p = new Partida(50,0,Dificultad,t,50,5);
            j.setPartida(p);
        }
    }
    
    
}
