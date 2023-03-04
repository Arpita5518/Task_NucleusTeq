/*Create a class phone which is having to method call() and sms(), create an interface camera which having abstract method click()
and record(), create another interface MusicPlayer having abstract class play() and stop() method.
Create concrete class SmartPhone which extends class phone and implements interface camera and
MusicPlayer and display all the mentioned method by creating object and references*/
interface Camera{
    void click();
    void record();

}
interface MusicPlayer{
    void play();
    void stop();
}

class Phone{
    void call(){
       System.out.println("Calling...");
    }
    void sms(){
        System.out.println("Sending sms..");

    }
}
class SmartPhone extends Phone implements Camera, MusicPlayer{
    public void play() {
        System.out.println("Playing Music..");
    }
    public void stop() {
        System.out.println("Stop Playing Music..");
    }
    public void click() {
        System.out.println("Clicking Photos..");
    }
    public void record() {
        System.out.println("Recording Videos..");
    }

}
 public class InterfaceImplement{
     public static void main(String[] args) {
        SmartPhone smartphone = new SmartPhone();
        smartphone.call();
        smartphone.sms();
        smartphone.play();
        smartphone.click();
        smartphone.stop();
        smartphone.record();
    }
 }