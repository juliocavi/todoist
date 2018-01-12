import java.util.ArrayList;
/** 
 * Cabecera: luis
 * Atributos: Gian carlo
 * Constructor: Aitor
 * mostrarTareasNumeradas: Samuel
 * agregarTarea: Omar
 * marcarTareaComoCompletada: Cristian
 **/

public class Todoist2{

    private ArrayList<Tarea> listaDeTareas; 

    /**
     * Constructor de la clase Todoist2
     */
    public Todoist2(){
        listaDeTareas = new ArrayList<Tarea>();
    }

    /**
     * Mostrar tareas numeradas
     */
    public void mostrarTareasNumeradas()
    {
        int posicionTareaActual = 0;
        while (posicionTareaActual < listaDeTareas.size()) {
            System.out.println((posicionTareaActual+1) + ". " + listaDeTareas.get(posicionTareaActual).getDatosTarea());
            posicionTareaActual++;
        }
    }

    /**
     * Añade una tarea
     */
    public void addTarea(String tarea)
    {
        Tarea nuevaTarea = new Tarea(tarea);
        listaDeTareas.add(nuevaTarea);

    }

    /**
     * Marca como completada la tarea indicada como parametro. Por ejemplo,
     * si el parámetro es 0 marca como completada la primera tarea, si es 1 la
     * segunda, etc.
     */
    public void marcarComoCompletada(int indiceTarea)
    {
        Tarea tareaActual = listaDeTareas.get(indiceTarea);
        tareaActual.tareaCompletada();
        //listaDeTareas.set(indiceTarea, tareaActual);
        //ESTAS LINEAS SOBRAN, YA QUE CON LA ANTERIOR YA ESTAMOS MODIFICANDO LA TAREA, AL TRATARSE DE UNA TAREA REFERENCIADA
    }

    /**
     * Cambia la prioridad de la tarea indicada.Por ejemplo,
     * si el parámetro es 0 cambia la prioridad de la primera tarea, si es 1 la
     * segunda, etc. Se asume que se indica una tarea valida.
     */

    public void cambiarPrioridad(int indiceTarea, int nuevaPrioridad)
    {
        if (indiceTarea>=0 && indiceTarea<listaDeTareas.size()){
            Tarea tareaActual = listaDeTareas.get(indiceTarea);
            tareaActual.setPrioridad(nuevaPrioridad);
            //listaDeTareas.set(indiceTarea, tareaActual);
        }
    }

    /**
     * Imprime todos los datos de la tarea con mayor prioridad. Si hay empate,
     * imprime la última encontrada. Si no hay tareas no imprime nada.
     */

    public void tareaConMayorPrioridad()
    {
        if (listaDeTareas.size() > 0){
            Tarea tareaPrioridadMaxima = listaDeTareas.get(0);
            int prioridadMaxima = 0;
            for (Tarea tareaActual : listaDeTareas){
                if (tareaActual.getPrioridad() >= prioridadMaxima){
                    tareaPrioridadMaxima = tareaActual;
                    prioridadMaxima = tareaActual.getPrioridad();
                }
            }
            System.out.println(tareaPrioridadMaxima.getDatosTarea());
        }
    }
}
