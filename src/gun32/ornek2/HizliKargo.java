package gun32.ornek2;

public class HizliKargo extends Kargo{
    public HizliKargo(String takipNo) {
        super(takipNo);
    }

    @Override
    void teslimSüresiGoster() {
        System.out.println("hızlı kargo 2 günde gelir");

    }
}

