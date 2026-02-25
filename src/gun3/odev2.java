package gun3;

public class odev2 {
    public static void main(String[] args) {
        String t = "Automation";
        System.out.println(t.length());

        String m = "Automation";
        System.out.println(m.charAt(0));
        System.out.println(m.charAt(4));

        String a = "Test";
        String b = "test";
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));

        String s = "Playwright";
        System.out.println(s.substring(4));
        System.out.println(s.substring(0, 4));
        System.out.println(s.substring(2, 7));


        String r = "Hello";
        String f = "Java";
        System.out.println(a.concat(" ").concat(b));
        System.out.println(a + "-" + b);

        String n = "Java is powerful";
        System.out.println(n.contains("is"));
        System.out.println(n.contains("Power"));

        String file = "Invoice_2026.PDF";
        System.out.println(file.startsWith("Inv"));
        System.out.println(file.endsWith(".PDF"));
        System.out.println(file.endsWith(".pdf"));

        String g = "banana";
        System.out.println(g.indexOf("a"));
        System.out.println(g.lastIndexOf("a"));
        System.out.println(g.indexOf("na"));



        String text = " ID: AB-123-CD ";
        System.out.println(text.trim());
        System.out.println(text.replace("-", "_"));
        System.out.println(text.replaceAll("\\D", ""));
        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());






    }
}
