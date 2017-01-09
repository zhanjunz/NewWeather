package com.qtking.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Think on 2017/1/9.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
