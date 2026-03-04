package gun11;

public class ArrayKonusu {
    public static void main(String[] args) {
        /**
         * aynı türden birden fazla elemana aynı değişken ismini vermemi sağlıyor.
         * int a= 5;
         * int b= 6;
         * int[] sayılar = {5,6}
         * array içerisindeki elemanlara index ile ulaşırız.
         * index 0(sıfır) dan başlar.
         * array uzunluğu oluşturulduktan sonra degiştirilemez.
         * string [], double[], float [] vs;
         **/
        int [] yaslar = new int [5]; // 5 elemanlık bir int dizisi
        // bu dizi içerisinde 5 tane int yas bilgisini tutabilir.
        /**
         * array limitini verip oluşturup, deger ataması yapmadığım durumlarda
         * default degerleri kendisi otomatik atar.
         * int ->0
         * double  -> 0.0
         * boolean -> false
         * string -> null
         * yaslar array inde daha atama yapılmadığı için degerler şu sekilde olur;
         * 0,0,0,0,0 -> 5 elemanlı ve int dizisi olduğu için 5 tane 0 atar.
         * */

        String[] cities = {"Berlin", "Jena","Ankara","İzmir"};
        int [] nums = {3,45,99,1,8,78};
        System.out.println(cities.length);   //4
        System.out.println(nums.length);     //6

        System.out.println("Degisiklik yapmadan önce: " + nums [0]); //3
        nums [0] = 34; //yeni değer ataması
        System.out.println("Degisiklikten sonra: " + nums [0]);

        System.out.println(cities[2]); //ankara, index 0 dan saymaya başlar.
        //System.out.println(nums[6]);  // hata verr çünkü 6. index yok
        //arraylerde sınır degeri baştan belli olur.
        //bu sınırı aşarsam hata verir.
        // o hata->  .ArrayIndexOutOfBoundsException

        //index lazım olduğunda for i ile array içerisinde gezeriz.
        for (int index = 0; index < nums.length; index++) {
            System.out.println(index + ". indexteki eleman " + nums[index]);
        }

        System.out.println("------------");
        //sadece eleman lazımken foreach kullanırız.
        for (int num: nums) {
            System.out.println(num);
        }

        System.out.println("----------");
        for (String city: cities) {
            System.out.print(city + " ");
        }



    }
}
