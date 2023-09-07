import java.util.HashMap;
import java.util.Map;

public class App {
    Map<String, Usuario> coleccionUsuarios;
    public App(){
        coleccionUsuarios = new HashMap<>();
    }

    public Usuario nuevoUsuario(String nombre){
        Usuario usuarioActual = coleccionUsuarios.get(nombre);

        if (usuarioActual == null){
            usuarioActual = new Usuario(nombre);
            coleccionUsuarios.put(nombre, usuarioActual);
        }
        return usuarioActual;
    }

    public boolean enviarMensaje(Usuario remitente, Usuario destinatario, String mensaje){

        Chat chatActualRemitente = remitente.obtenerChat(destinatario);
        Chat chatActualDestinatario = destinatario.obtenerChat(remitente);

        chatActualRemitente.guardarMensaje(mensaje);
        chatActualDestinatario.guardarMensaje(mensaje);

        return true;
    }

    public void mostrarMensajes(Usuario remitente ,Usuario destinatario){
        Chat chatActual = remitente.obtenerChat(destinatario);
        chatActual.historialMensaje();
    }

}
