package gun4;

import com.sun.tools.javac.Main;

public class IfElse {
    public static void main(String[] args) {

        int age = 20;

        if (age > 18) {
            System.out.println("Ehliyet alabilir");
        } else {
            System.out.println("Ehliyet almaya uygun degil");
        }

        int not = 90;
        if (not >= 85) {
            System.out.println("Pekiyi");
        } else if (not >=70) {
            System.out.println("iyi");
        }else if (not >=50) {
            System.out.println("sinavi gecti");
        }else {
            System.out.println("sinavdan kaldi");
        }

        String lesson ="sss";
        if (lesson.equals("Java")) {
            System.out.println("Ders ismi dogru");
        } else {
            System.out.println("Ders ismi yanlis");
        }

        int yas = 18;
        boolean kimlikVarMi = true;
        if (yas>=18 && kimlikVarMi) {
            System.out.println("Sinava girebilir");
        } else  {
            System.out.println("Sinava giremez");
        }

        int sayi = 5;
        String result = (sayi % 2 == 0)? "cift": "tek";
                System.out.println(result);



    }
}
