import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static String nombreJugador1;
    public static String nombreJugador2;
    public static String lado;
    public static String ladoGanador;

    public static void main(String[] args) {

        String juegoTerminado = "SI";
        while (juegoTerminado.equals("SI")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bievenido al juego de tirar una moneda!!");
            System.out.println("Inserte nombre del primer jugador: ");
            nombreJugador1 = scanner.nextLine().toUpperCase(Locale.ROOT);
            System.out.println("Inserte nombre del segundo jugador: ");
            nombreJugador2 = scanner.nextLine().toUpperCase(Locale.ROOT);

            System.out.println("Bueno " + nombreJugador1 + " por favor selecciona el lado de la moneda Cara o Cruz??");
            lado = scanner.nextLine().toUpperCase(Locale.ROOT);
            while (!validarLado(lado)) {
                System.out.println("Solo CARA o CRUZ permitido");
                lado = scanner.nextLine().toUpperCase(Locale.ROOT);
            }

            Jugador jugador1 = new Jugador(nombreJugador1, lado);
            Jugador jugador2 = new Jugador(nombreJugador2, "");

            System.out.println("Ok ok lanzamos la moneda...");
            Coin coin = new Coin();
            ladoGanador = coin.flipCoin();

            System.out.println("..");
            System.out.println(ladoGanador);
            System.out.println("..");

            if (jugador1.getEleccion().equals(ladoGanador)) {
                System.out.println("BUENA ESA " + nombreJugador1);
            } else {
                System.out.println("BUENA ESA " + nombreJugador2);
            }

            System.out.println("Desea jugar de nuevo? SI O NO");
            juegoTerminado = scanner.nextLine().toUpperCase(Locale.ROOT);

            while (!validarRespuesta(juegoTerminado)) {
                System.out.println("Solo SI o NO permitido");
                juegoTerminado = scanner.nextLine().toUpperCase(Locale.ROOT);
            }
        }
    }

    public static boolean validarLado(String lado) {

        return lado.equals("CARA") || lado.equals("CRUZ");
    }

    public static boolean validarRespuesta(String juegoTerminado) {

        return juegoTerminado.equals("SI") || juegoTerminado.equals("NO");

    }


}

