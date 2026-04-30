package gun35;

public class StringBuilderVeStringBuffer {
    public static void main (String[] args) {
        /**
         * [metin][metin][metin][][][][][][] -> String
         *[][][][][][][][] -> String Builder Ve String Buffer

         * döngü içinde sürekli metin ekleme, silme, birleştirme işlemleri yapılıyorsa.
         -gereksiz yere çok fazla nesne oluşur.
         -performans düşer.
         -bellek kullanımı artar.
         **/
        String metin = "merhaba";
        metin = metin + "dünya";
        metin = metin + "!" ;

        System.out.println("metin: " + metin);

        /**
         * StringBuilder, metin üzerinde değişiklik yapmayı kolaylaştıran ve hızlı çalışan bir classtır.
         * Neler yapar:
         * sona ekleme yapar.
         * araya ekleme yapar
         * silme işlemi yapar
         * karakterleri değiştirir.
         * ters çevirebilir.
         **/

        StringBuilder stringBuilder = new StringBuilder("merhaba");

        stringBuilder.append(" dünya");  //append() metodu ekleme yapar.

        //bu kullanım sayesinde yeni yeni nesneler üretmedi onun yerine tek nesne üzerinden işlemleri gerçekleştirdi.

        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer("hello");
        stringBuffer.append(" world");

        System.out.println(stringBuffer);

        /**
         * stringBuilder -> daha hızlıdır.
         * stringBuffer -> thread-safe, yani çoklu işlemlerde daha güvenli.
         *
         * en çok kullanılan metodlar:
         * append() -> sona ekleme yapar.
         * StringBuilder stringBuilder = new StringBuilder("java");
         * stringBuilder.append("ogreniyorum");
         * System.out.println(stringBuilder);  // java ogreniyorum
         *
         * insert() -> belirli bir index e ekleme yapar.
         * StringBuilder stringBuilder = new StringBuilder("jaa");
         * stringBuilder.insert(2,"v");
         * System.out.println(stringBuilder);   //java
         *
         * delete() -> belirli aralıktaki karakterleri siler
         * StringBuilder stringBuilder = new StringBuilder("merhaba dünya");
         * stringBuilder.delete(7,13);
         * System.out.println(stringBuilder); // merhaba
         *
         * deleteCharAt() -> tek bir karakter siler
         * StringBuilder stringBuilder = new StringBuilder("javva");
         * stringBuilder.deleteCharAt(3);
         * System.out.println(stringBuilder); // java
         *
         * replace() -> belirli aralıktaki kısmı başka bir metinle değiştirir.
         * StringBuilder stringBuilder = new StringBuilder("merhaba java");
         * stringBuilder.replace(8,12, "dünya");
         * System.out.println(stringBuilder); // java dünya
         *
         * setCharAt() -> belirli bir indexteki karakteri değiştirir.
         * StringBuilder stringBuilder = new StringBuilder("jaxa");
         * stringBuilder.setCharAt(2,'v');
         * System.out.println(stringBuilder); // java
         *
         * reverse() -> metni ters çevirir.
         * StringBuilder stringBuilder = new StringBuilder("java");
         * stringBuilder.reverse();
         * System.out.println(stringBuilder); // avaj
         *
         * length() -> karakter sayısını verir.
         * StringBuilder stringBuilder = new StringBuilder("merhaba");
         * stringBuilder.length();
         * System.out.println(stringBuilder); // 7
         *
         * charAt() -> belirli indexteki karakteri verir
         * StringBuilder stringBuilder = new StringBuilder("java");
         * System.out.println(stringBuilder.charAt(1); // a
         *
         * toString()
         * StringBuilder stringBuilder = new StringBuilder("java");
         * String metin = stringBuilder.toString();
         * System.out.println(metin);
         *
         **/

        System.out.println();


    }
}
