package com.example.asteriskfcm.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccessUserVO {
    @SerializedName("ipv4")
    @Expose
    private String ipv4;

    @SerializedName("ipv4")
    @Expose
    private String token;

    @SerializedName("ipv4")
    @Expose
    private String date;

    public String getIpv4() {
        return ipv4;
    }

    public void setIpv4(String ipv4) {
        this.ipv4 = ipv4;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
