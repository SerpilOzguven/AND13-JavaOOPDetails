package com.serpilozguven.javaoopdetails;

public class Kopek extends Hayvan implements Egitim{
    public Kopek() {

    }

    public Kopek(String isim, String gozRengi, String tuyRengi) {
        super(isim, gozRengi, tuyRengi);
    }

    @Override
    public boolean egitimAl() {
        System.out.println("köpekler eğitim alır");
        return true;
    }

    @Override
    public boolean egitimAlBody() {
        System.out.println("köpekler gayet de eğitim alır");
        return true;
    }
}
