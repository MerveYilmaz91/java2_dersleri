package gun32.ornek2;

public class StandartKargo extends Kargo {


    public StandartKargo(String takipNo) {
        super(takipNo);
    }

    @Override
    void teslimSüresiGoster() {
        System.out.println("standart kargo 5 günde gelir ");

    }
}


