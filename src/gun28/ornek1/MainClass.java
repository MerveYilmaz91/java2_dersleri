package gun28.ornek1;

public class MainClass {
    public static void main (String[] args) {
        Calisan manager = new Calisan("mehmet",50000,32, "test adress", Role.MANAGER);

        Manager manager1 = new Manager("merve", 60000, 35, "test adress");

        tester tester = new tester("gökay", 45000, 28, "testtt");

        developer developer = new developer("asya", 80000, 30, "testtt");

        manager.bilgiYazdir();
        developer.bilgiYazdir();
        tester.bilgiYazdir();







    }
}
