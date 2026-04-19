package gun32.ornek2;

public abstract class Kargo {
    String takipNo;

    public Kargo(String takipNo) {
        this.takipNo = takipNo;
    }

    void takipBilgisi() {
        System.out.println("takip numarası: " + takipNo);
    }

    abstract void teslimSüresiGoster();


}
