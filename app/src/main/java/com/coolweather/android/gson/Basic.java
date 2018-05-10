package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by abc on 2018/5/10.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherid;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
