package com.example.x_cite;

public class Phons {
    private String PhonName ;
    private String PhoneBrand ;
    private int PhoneIMge ;

    public Phons(String phonName, String phoneBrand, int phoneIMge) {
        PhonName = phonName;
        PhoneBrand = phoneBrand;
        PhoneIMge = phoneIMge;
    }

    public String getPhonName() {
        return PhonName;
    }

    public void setPhonName(String phonName) {
        PhonName = phonName;
    }

    public String getPhoneBrand() {
        return PhoneBrand;
    }

    public void setPhoneBrand(String phoneBrand) {
        PhoneBrand = phoneBrand;
    }

    public int getPhoneIMge() {
        return PhoneIMge;
    }

    public void setPhoneIMge(int phoneIMge) {
        PhoneIMge = phoneIMge;
    }
}
