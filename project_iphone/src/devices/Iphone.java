package devices;

import java.util.Random;

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
        Random random = new Random();
        int answer = random.nextInt() % 2;
        System.out.println(answer);
        //if answer
        if (answer == 0) {
            System.out.println("answer call");
        } else {
            voiceMail();
        }
        //else
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
