package com.interview.impetus.phone;

public class PhoneModel {

    private String phoneCategory;

    private String phoneType;

    private String phoneRam;

    private String phoneSize;

    private String phoneColor;

    public PhoneModel(String phoneCategory, String phoneType, String phoneRam, String phoneSize, String phoneColor) {
        this.phoneCategory = phoneCategory;
        this.phoneType = phoneType;
        this.phoneRam = phoneRam;
        this.phoneSize = phoneSize;
        this.phoneColor = phoneColor;
    }

    protected PhoneModel() {
    }

    public String getPhoneCategory() {
        return phoneCategory;
    }

    public void setPhoneCategory(String phoneCategory) {
        this.phoneCategory = phoneCategory;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getPhoneRam() {
        return phoneRam;
    }

    public void setPhoneRam(String phoneRam) {
        this.phoneRam = phoneRam;
    }

    public String getPhoneSize() {
        return phoneSize;
    }

    public void setPhoneSize(String phoneSize) {
        this.phoneSize = phoneSize;
    }

    public String getPhoneColor() {
        return phoneColor;
    }

    public void setPhoneColor(String phoneColor) {
        this.phoneColor = phoneColor;
    }
}
