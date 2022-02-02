public class Jugador {

    protected final String nombre;
    protected final String eleccion;

    public Jugador(String nombreJugador, String eleccion){

        this.nombre = nombreJugador;
        this.eleccion = eleccion;
    }

    public String getEleccion() {
        return eleccion;
    }
}
