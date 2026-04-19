package gun27.ornek6;

public class MainClass {
    public static void main (String[] args) {
        /**
         * bir akıllı lambanın çalışma modu tutuluyor.
         * modlar: okuma, gece ve normal olsun.
         * lamba oluştururken başlangıç moduverilsin.
         * daha sonra mod değiştirildiğinden ekrana yeni mod yazdırılsın.
         **/

        AkilliLamba lamba = new AkilliLamba(LambaModu.GECE);
        lamba.modDegistir(LambaModu.OKUMA);
    }
}
