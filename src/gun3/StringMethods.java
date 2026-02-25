package gun3;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Automation";
        System.out.println(s.substring(4, s.length() -1));
        // s. Legenth() -> 10 bu değeri hesaplamak zorunda değiliz.
        // s.legenth() -1  -> bu ifade zaten son harfi alma diyor.

        System.out.println("------soru 2----");
        String a =("java@spring@boot");
        int i = a.indexOf("@");  // indexOf olduğu için ilk gördüğü @ işaretinin indexini aldı
        System.out.println(a.substring(0,i));

        System.out.println("------soru 3----");
        String y = "report.final.v2.pdf";
        System.out.println(y.substring(y.lastIndexOf('.')+1));


        System.out.println("------soru 4----");
        String x = "2026-02-13";
        System.out.println(x.replace("-", "/"));


        System.out.println("------soru 5----");
        String c = "Order# TR-98A-1200!";
        System.out.println(c.replaceAll("\\D",""));


        System.out.println("------soru 6----");
        String v = "https://medlehrer.com";
        System.out.println(v.startsWith("https") && v.contains("medlehrer"));
        // true- true = true
        // true-false veya false-true = false
        // false- false = false



        System.out.println("------soru 7----");
        String n = "ADMIN";
        String b = "admin";
        System.out.println(n.equalsIgnoreCase(b));


        System.out.println("------soru 8----");
        String m = "TR123456";
        System.out.println(m.substring(m.length() - 2));


        System.out.println("------soru 9----");
        String r = "selenium";
        System.out.println(r.indexOf("b"));


        System.out.println("------soru 10----");
        int z = 7;
        int u = 5;
        String j = String.valueOf(z).concat(String.valueOf(u));
        System.out.println(j);


        System.out.println("------soru 11----");
        String name = "Mehmet Simsek Berlin";
        int index = name.indexOf(" ");
        System.out.println(name.substring(0,index));


        System.out.println("------soru 12----");
        String p = "QA SDET Java";
        System.out.println(p.substring(p.lastIndexOf(" ") +1));



        System.out.println("------soru 13----");
        String email = "user.test@gmail.de";
        System.out.println(email.substring(email.indexOf("@") +1));
















    }
}
