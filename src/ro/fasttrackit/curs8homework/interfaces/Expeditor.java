package ro.fasttrackit.curs8homework.interfaces;

public class Expeditor {
    private MessageSender messageSender;

    public Expeditor(MessageSender messageSender){
        this.messageSender = messageSender;
    }
    public void sendMessage(String msg){
        this.messageSender.send("My message is " + msg);
        System.out.println("M-a costat " + this.messageSender.getCost());
    }
}
