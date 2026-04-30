package gun35;

public class KelimeDuzenleme {
    public static void main (String[] args) {
        /**
         * Başlangıçta "Jvaa Programlama" metni verilsin
         * bu metindek yazım hatasını düzeltsin ve sonuç:
         * Java Programlama
         **/

        StringBuilder sb = new StringBuilder("Jvaa Programlama");

        sb.replace(0,4,"Java");

        System.out.println(sb);


    }
}
