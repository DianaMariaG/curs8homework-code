package ro.fasttrackit.curs8homework.interfaces.advertise;

public class PrintAdvertiser implements AdvertiseService {
    public PrintAdvertiser() {
    }

    public String advertise() {
        return "Print this advertisment!";
    }
}