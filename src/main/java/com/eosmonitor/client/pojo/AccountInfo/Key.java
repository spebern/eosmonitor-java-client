package com.eosmonitor.client.pojo.AccountInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Key {
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("weight")
    @Expose
    private Integer weight;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
