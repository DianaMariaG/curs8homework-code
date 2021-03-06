package ro.fasttrackit.curs8homework.advertise;

public class Advertiser {
    private AdvertiseService advertiseService;

    public Advertiser(AdvertiseService advertiseService) {
        this.advertiseService = advertiseService;
    }

    public String sendAdvertisment() {
        return this.advertiseService.advertise();
    }
}
