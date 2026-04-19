package gun32.InterfaceIle;

public class MesajBildirim implements Bildirim{

    @Override
    public void gonder() {
        System.out.println("mesaj ile bildirim gönderildi.");
    }
}
