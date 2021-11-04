package ro.fasttrackit.curs8homework.interfaces;

public class EmailSender implements MessageSender {
    public EmailSender() {
    }

    public void send(String msg) {
        System.out.println("Sending over email " + msg);
    }

    public int getCost() {
        return 1;
    }
}
