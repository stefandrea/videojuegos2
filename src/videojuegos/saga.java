package videojuegos;

public class saga extends Videojuegos{
    
    private int episodios;
    private boolean ingles;
    private String autor; 

    public saga(String usuarioDelJugador, int niveles, int cantidadDeAvatares, int inventario, boolean online, boolean actualizaciones) {
        super(usuarioDelJugador, niveles, cantidadDeAvatares, inventario, online, actualizaciones);
    }

    public saga(int episodios, boolean ingles, String autor, String usuarioDelJugador, int niveles, int cantidadDeAvatares, int inventario, boolean online, boolean actualizaciones) {
        super(usuarioDelJugador, niveles, cantidadDeAvatares, inventario, online, actualizaciones);
        this.episodios = episodios;
        this.ingles = ingles;
        this.autor = autor;
    }
 
}
