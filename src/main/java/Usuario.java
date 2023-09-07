import java.util.HashMap;
import java.util.Map;

public class Usuario {
    private Map<Usuario, Chat> coleccionChat;
    private String nombre;
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
