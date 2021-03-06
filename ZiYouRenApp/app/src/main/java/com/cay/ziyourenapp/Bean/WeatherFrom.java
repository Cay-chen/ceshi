package com.cay.ziyourenapp.Bean;

/**
 * Created by Cay on 2016/7/2.
 */
public class WeatherFrom {
    private String city;
    private String cityid;
    private String data;
    private String week;
    private String temp1;
    private String temp2;
    private String weather;
    private String img1;
    private String img2;

    private String ptime;

    public WeatherFrom(String city, String cityid, String data, String week, String temp1, String temp2, String weather, String img1, String img2, String ptime) {
        this.city = city;
        this.cityid = cityid;
        this.data = data;
        this.week = week;
        this.temp1 = temp1;
        this.temp2 = temp2;
        this.weather = weather;
        this.img1 = img1;
        this.img2 = img2;
        this.ptime = ptime;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getTemp1() {
        return temp1;
    }

    public void setTemp1(String temp1) {
        this.temp1 = temp1;
    }

    public String getTemp2() {
        return temp2;
    }

    public void setTemp2(String temp2) {
        this.temp2 = temp2;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getPtime() {
        return ptime;
    }

    public void setPtime(String ptime) {
        this.ptime = ptime;
    }

    @Override
    public String toString() {
        return "WeatherFrom [city=" + city + "，cityId=" + cityid + "，data=" + data + "，week="
                + week + "，temp1=" + temp1 + "，temp2=" + temp2 + "，weather=" + weather + "，img1="
                + img1 + "，img2=" + img2 + "，ptime=" + ptime + "]";

    }

}
