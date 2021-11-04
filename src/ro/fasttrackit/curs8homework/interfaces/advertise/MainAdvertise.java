package ro.fasttrackit.curs8homework.interfaces.advertise;

public class MainAdvertise {
    public MainAdvertise() {
    }

    public static void main(String[] args) {
        FacebookAdvertiser facebookAdvertiser = new FacebookAdvertiser();
        Advertiser advertiser1 = new Advertiser(facebookAdvertiser);
        System.out.println(advertiser1.sendAdvertisment());

        EmailAdvertiser emailAdvertiser = new EmailAdvertiser();
        Advertiser advertiser2 = new Advertiser(emailAdvertiser);
        System.out.println(advertiser2.sendAdvertisment());

        PrintAdvertiser printAdvertiser = new PrintAdvertiser();
        Advertiser advertiser3 = new Advertiser(printAdvertiser);
        System.out.println(advertiser3.sendAdvertisment());
    }
}

