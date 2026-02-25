package gun4;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println("Toplama:" + (a + b));
        System.out.println("Cikarma:" + (a - b));
        System.out.println("Carpma:" + (a * b));
        System.out.println("Bolme:" + (a / b));
        System.out.println("Mod:" + (a % b));

        int x = 5;
        double y = 2;
        System.out.println("Bolme sonucu:" + (x / y));

        System.out.println("-----------");

        int n = 5;
        System.out.println("Artirmadan once: "+(n++));
        System.out.println("Artirmadan sonra: " + n);

        int m = 5;
        System.out.println(++m);
        System.out.println(m);


        System.out.println("--------");


        int v = 10;
        v +=5;
        v -=5;
        v *=5;
        v /=5;
        v %=5;
        System.out.println(v);


        System.out.println("--------");


        int result = 10 * 3+ 2;
        System.out.println("Sonuc" + result);

        int result2 = (10 + 2) * 3;
        System.out.println("Result2: " + result2);




    }
}
