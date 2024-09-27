import consoles.PlayStation;
import consoles.Xbox;

public class Main {
    public static void main(String[] args) {
        PlayStation ps5 = new PlayStation("PlayStation 5");
        Xbox xboxSeriesX = new Xbox("Xbox Series X");

        // Testando o console PlayStation
        ps5.ligar();
        ps5.rodarAplicativo("Netflix");
        ps5.rodarAplicativo("God of War");
        ps5.desligar();

        // Testando o console Xbox
        xboxSeriesX.ligar();
        xboxSeriesX.rodarAplicativo("Forza Horizon 5");
        xboxSeriesX.rodarAplicativo("Netflix");
        xboxSeriesX.desligar();
    }
}