package com.eosmonitor.client.pojo.AccountInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NetLimit {
    @SerializedName("available")
    @Expose
    private Integer available;
    @SerializedName("max")
    @Expose
    private Integer max;
    @SerializedName("used")
    @Expose
    private Integer used;

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }
}
