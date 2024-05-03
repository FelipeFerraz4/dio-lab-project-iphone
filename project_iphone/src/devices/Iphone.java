package devices;

public class Iphone extends phone implements Browser, Ipod  {
    public void pause(){
        System.out.println("Pause Music");
    }

    public void displayPage(int ip){
        System.out.println("page with ip: " + ip);
    }

    public void play() {
        System.out.println("Play Music");
    }

    public void call(int number) {
        System.out.println("call to " + number);
    }

    public void answer() {
        System.out.println("answer call");
    }
    public void newPage() {
        System.out.println("New Page Created");
    }

    public void updatePage() {
        System.out.println("Update Page");
    }

    public void selectMusic(int idMusic) {
        System.out.println("Music selected");
    }

    protected void voiceMail() {
        System.out.println("Voice Register");
    }
}
