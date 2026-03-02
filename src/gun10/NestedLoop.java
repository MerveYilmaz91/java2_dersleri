package gun10;

public class NestedLoop {
    public static void main(String[] args) {
        /**
         * //dış döngü -> tur sayısını belirtir.
         * for (int i = 0; i< bitisDegeri ; i++ ) { // satir
         * // iç döngü -> o turdaki tekrar sayısını belirtir.
         * for (int j = 0 < bitisDegeri2 ; j++) { sütun
         *
         *
         *  örn: haftada 5 gün ders var: dış döngü
         *  her gün 3 ders var: iç döngü
         *  toplamda haftada 15 ders var
         *  */

        for (int gun = 1; gun <= 5; gun++ ) {
            for (int ders = 1; ders <= 3; ders++ ) {
                System.out.println(gun + ".gün " + ders + ".ders ");
            }
            System.out.println();
        }

    }
}
