package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by abc on 2018/5/9.
 */

public class County extends DataSupport {

    private int id;
    private String countryName; //县名
    private String weatherId;   //县所对应的天气ID
    private int cityId;         //当前县所属的市ID

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCountryName(){
        return countryName;
    }

    public void setCountryName(String countryName){
        this.countryName = countryName;
    }

    public String getWeatherId(){
        return weatherId;
    }

    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }

    public int getCityId(){
        return cityId;
    }

    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}
