import java.util.ArrayList;

/**
 * Clase que permite almacenar las tareas pendientes que tenemos por hacer.
 */
public class Todoist{
    //Nuestras 3 tareas.
    private ArrayList<String> tareas;

    /**
     * Constructorde la clase todoist. Crea un gestor con las 3 tareas vacias.
     */

    public Todoist()
    {
        tareas = new ArrayList<String>();
    }

    /**
     * Inserta la tarea especifica en la posicion indicada
     */
    public void addTarea(String nombreTarea){
        tareas.add(nombreTarea);
    }

    /**
     * Mostrar por pantalla las tareas existentes
     */
    public void mostrarTareas(){
        System.out.println("Tareas pendientes:");
        System.out.println(tareas);
    }
    
    /**
     * Devuelve el numero de tareas
     */
    public int getNumeroDeTareas(){
        return tareas.size();
    }
    
    /**
     * Imprime por pantalla el numero de tareas pendientes
     */
    public void mostrasNumeroDeTareasPendientes(){
        System.out.println(tareas.size());
    }
    
    /** 
     * Elimina la tarea que ocupa la posicion indicada como
     * parametro (empezando en 0). Devuelce true si elimina una 
     * tarea, false en caso contrario
     */
    public boolean eliminarTarea(int posicionTarea){
        boolean valorADevolver = false;
        if(posicionTarea >= 0 && posicionTarea < (tareas.size())-1){
            tareas.remove(posicionTarea);
            valorADevolver = true;
        }
        return valorADevolver;
    }
}