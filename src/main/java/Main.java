public class Main {
    public static void main(String[] args) {
        App app = new App();
        Usuario usuarioUno = app.nuevoUsuario("seba");
        Usuario usuarioDos = app.nuevoUsuario("lucas");
        app.enviarMensaje(usuarioUno, usuarioDos, "Hola lucas");
        app.enviarMensaje(usuarioDos, usuarioUno, "Hola como estas?");
        app.enviarMensaje(usuarioUno, usuarioDos, "Muy bien vos?");
        app.enviarMensaje(usuarioDos, usuarioUno, "todo tranqui");

        app.mostrarMensajes(usuarioUno, usuarioDos);
        System.out.println("\n\n");
        app.mostrarMensajes(usuarioDos, usuarioUno);
    }
}
