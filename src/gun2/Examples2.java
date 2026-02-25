package gun2;

public class Examples2 {
    public static void main(String[] args) {
        String s = "3.5";
        double d = Double.parseDouble(s);
        System.out.println((int)(d * 2));


        int a = 2;
        System.out.println(a + "3" + 4 );
        System.out.println(a + 3 + "4");

        System.out.println("A" + 'B' + 1);
        System.out.println('A' + 'B' + "1");

        System.out.println(-10 % 3);
        System.out.println(10 % 3);

        String ss = "010";
        int n = Integer.parseInt(ss);
        System.out.println(n + 5);
        System.out.println(ss + 5);

        double dd = 0.1 + 0.2;
        System.out.println(dd);
        System.out.println(dd = 0.3);











    }
}
