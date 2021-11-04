package ro.fasttrackit.curs8homework.interfaces.advertise;

public class EmailAdvertiser implements AdvertiseService {
    public EmailAdvertiser() {
    }

    public String advertise() {
        return "Email helps you to advertise better!";
    }
}