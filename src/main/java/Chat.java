import java.util.ArrayList;
import java.util.List;

public class Chat {
    private List<Mensaje> coleccionMensajes;
    public Chat(){
        coleccionMensajes = new ArrayList<>();
    }

    public void guardarMensaje(String mensaje){
        Mensaje nuevoMensaje = new Mensaje(mensaje);
        coleccionMensajes.add(nuevoMensaje);
    }

    public void historialMensaje(){
        for(Mensaje msg : coleccionMensajes){
            System.out.println("- " + msg + "\n");
        }
    }
}
