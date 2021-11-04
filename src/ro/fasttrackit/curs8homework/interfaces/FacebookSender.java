package ro.fasttrackit.curs8homework.interfaces;

public class FacebookSender implements MessageSender {
    public FacebookSender() {
    }

    public void send(String msg) {
        System.out.println("Sending over Facebook " + msg);
    }

    public int getCost() {
        return 10;
    }
}
