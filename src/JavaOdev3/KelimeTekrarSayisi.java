package JavaOdev3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KelimeTekrarSayisi {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan bir cümle alınız.
         * Cümledeki kelimeleri ayırınız ve her kelimenin kaç kez geçtiğini bulunuz.
         * Sonucu örnek olarak şu şekilde yazdırınız: elma = 2, armut = 1
         **/

        Scanner scanner=new Scanner(System.in);
        System.out.println("kullanıcıdan bir cümle alınız.");

        String cumle= scanner.nextLine();

        String[] kelimeler =cumle.split(" ");

        Map<String, Integer> sayac =new HashMap<>();

        for (String kelime:kelimeler){
            if(sayac.containsKey(kelime)){
                sayac.put(kelime,sayac.get(kelime)+1);
            }else {
                sayac.put(kelime,1);
            }
        }
        for(Map.Entry<String, Integer> entry:sayac.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}
