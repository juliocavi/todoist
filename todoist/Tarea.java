/**
 * Crea un objeto que almacena una tarea y su estado (completada o no).
 * 
 * @author 1ºDAM 2017/2018
 * @version 10/11/2018
 */

public class Tarea 
{
    private String descripcion;
    // El estado de la tarea: True: Completada; False: No Completada. 
    private boolean estado;
    private int prioridad;

    /**
     * Constructor de la clase Tarea.
     * @param descripcion La descripción de la tarea
     * Sergio
     */
    public Tarea(String descripcion)
    {
        this.descripcion = descripcion;
        estado = false;
        prioridad = 1;

    }

    /**
     * Devuelve si el estado es true o false.
     */
    public boolean getEstado()
    {
        return estado;  
    }

    /**
     * Devuelve la descripción de la tarea.
     */
    public String getDescripcion()
    {
        return descripcion;
    }
    
    /**
     * Devolver prioridad de la tarea
     */
    public int getPrioridad()
    {
        return prioridad;
    }
    
    /**
     * Devuelve toda la informacion de la tarea en formato String
     */
    public String getDatosTarea()
    {
        String aDevolver = descripcion + " Prioridad: " + prioridad;
        if (estado) {
            aDevolver = "[X] " + aDevolver;
        }
        else {
            aDevolver = "[ ] " + aDevolver;
        }
        return aDevolver; 
    }

    
    
    /**
     * Metodos setter
     * Javier y Jorge
     */
    public void tareaCompletada() {
        estado = true;
    }
    
    /**
     * Cambiar prioridad de la tarea
     */
    
    public void setPrioridad(int prioridad){
        if (prioridad >= 1 && prioridad <= 5){
            this.prioridad = prioridad;
        }
    }
}


