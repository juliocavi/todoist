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
    public void mostrarNumeroDeTareasPendientes(){
        System.out.println(tareas.size());
    }

    /** 
     * Elimina la tarea que ocupa la posicion indicada como
     * parametro (empezando en 0). Devuelce true si elimina una 
     * tarea, false en caso contrario
     */
    public boolean eliminarTarea(int posicionTarea){
        boolean valorADevolver = false;
        if(indiceValido(posicionTarea)){
            tareas.remove(posicionTarea);
            valorADevolver = true;
        }
        return valorADevolver;
    }

    /**
     * Metodo que comprueba si una posicion es valida y devuelve true
     * en caso afirmativo o false en otro caso.
     */
    public boolean indiceValido(int indice){
        /**boolean valorADevolver = false;
         * if(indice >= 0 && indice < tareas.size()){
         *     valorADevolver = true;
         * }
         * return valorADevolver;
         */
        //otra forma de hacerlo
        //return tareasPendientes();
        return (indice >= 0 && indice < tareas.size());
    }

    /**
     * Metodo que devuelve true en caso de que haya tareas por hacer, false
     * en otro caso
     */    
    public boolean tareasPendientes(){
        //return !tareas.isEmpty();
        return (getNumeroDeTareas() > 0);
    }

    /** 
     * Metodo que imprime todas las tareas existentes, una por linea.
     * El metodo imprime el numero de posicion de la tarea antes del
     * nombre de la tarea.
     */  
    public void mostrarTareasNumeradas(){
        int numeroPosicion = 1;
        for (String tarea : tareas){
            System.out.println(numeroPosicion + ". " + tarea);
            numeroPosicion = numeroPosicion + 1;
        }
    }
        
    /**
     * Muestra solo las tareas en posiciones impares sin numero delante ni nada,
     * solo la tarea
     */
    public void mostrarTareasEnPosicionImpar(){
        int numeroPosicion = 0;
        for (String tarea : tareas){
            numeroPosicion += numeroPosicion;
            if(numeroPosicion % 2 != 0){
                System.out.println(tarea);
            }
        }
        
    } 
    
    /**
     * Muestra solo las tareas en posiciones impares sin numero delante ni nada,
     * solo la tarea
     */
    public void mostrarTareasEnPosicionImpar2(){
        int numeroPosicion = 1;
        for (String tarea : tareas){
            
            if(numeroPosicion % 2 != 0){
                System.out.println(tarea);
            }
            numeroPosicion ++;
        }
        
    } 
    
    /**
     * Muestra por pantalla todas las tareas que contienen el texto indicado
     * como parámetro, una en cada linea. Si no hay ninguna que contenga el texto
     * buscado, no muestra nada
     */
    public void mostrarCoincidenctes(String textoABuscar)
    {
        for (String tarea : tareas){
            if(tarea.contains(textoABuscar)){
                System.out.println(tarea);
            }
        }
    }
}