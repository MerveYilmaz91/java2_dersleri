package gun35;

public class CumleDuzenleme {
    public static void main (String[] args) {
        /**
         * başlangıçta "java cok eğlenceli" metni olsun
         * bu metinde
         * cok kelimesi çok olarak düzeltilecek
         * cümlenin sonuna bir dil. eklenecek.
         *
         * son hali şu olacak
         * Java çok eğlenceli bir dil
         **/

        StringBuilder sb = new StringBuilder("java cok eglenceli");

        sb.replace(5,8,"çok");

        sb.append(" bir dil.");

        System.out.println(sb);

    }
}
