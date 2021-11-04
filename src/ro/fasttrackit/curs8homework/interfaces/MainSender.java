package ro.fasttrackit.curs8homework.interfaces;

public class MainSender {
    public MainSender() {
    }

    public static void main(String[] args) {
        MessageSender facebookSender = new FacebookSender();
        MessageSender smsSender = new SMSSender();
        MessageSender emailSender = new EmailSender();

        Expeditor expeditor1 = new Expeditor(facebookSender);
        expeditor1.sendMessage("salutare tuturor!");

        Expeditor expeditor2 = new Expeditor(smsSender);
        expeditor2.sendMessage("Hello world!");

        emailSender.send("Buenas noche!");
    }
}
