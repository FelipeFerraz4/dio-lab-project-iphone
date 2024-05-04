import devices.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Iphone iphone = new Iphone();
        iphone.play();
        iphone.pause();
        iphone.selectMusic(0);

        iphone.call(911223344);
        iphone.answer();

        iphone.displayPage("10.111.11.111");
        iphone.newPage();
        iphone.updatePage();
    }
}
