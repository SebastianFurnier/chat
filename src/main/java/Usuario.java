import java.util.HashMap;
import java.util.Map;

public class Usuario {
    Map<Usuario, Chat> coleccionChat;
    String nombre;
    public Usuario(String nombre){
        coleccionChat = new HashMap<>();
        this.nombre = nombre;
    }
    
    public Chat obtenerChat(Usuario destinatario){
        Chat chatActual = coleccionChat.get(destinatario);
        if (chatActual == null){
            chatActual = new Chat();
            coleccionChat.put(destinatario, chatActual);
        }
        return chatActual;
    }

    public String toString(){
        return nombre;
    }
}
