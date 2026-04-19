package gun27.ornek1;

public class TrafikIsiklari {
    private IsikDurumu durumu;


    public TrafikIsiklari (IsikDurumu durumu) {
        this.durumu = durumu;

    }
    public void mesajiGoster() {
        switch (durumu) {
            case KIRMIZI -> System.out.println("dur");
            case SARI -> System.out.println("hazırlan");
            case YESİL -> System.out.println("geç");
        }
    }


}
