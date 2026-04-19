package gun32.InterfaceIle;

public class EmailBildirim implements Bildirim{
    @Override
    public void gonder() {
        System.out.println("Email ile bildirim gönderildi.");
    }
}
