import java.util.Random;

public class Coin {

    private final String[] lados = {"CARA","CRUZ"};

    public String flipCoin(){

        Random random = new Random();
        String lado = lados[random.ints(0, 2).findFirst().getAsInt()];
        return lado;
    }

}
