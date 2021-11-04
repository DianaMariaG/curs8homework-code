package ro.fasttrackit.curs8homework.interfaces;

public class SMSSender implements MessageSender {
    public SMSSender(){

    }

    public void send(String msg){
        System.out.println("Sending over SMS " + msg);
    }

    public int getCost(){
        return 3;
    }
}
