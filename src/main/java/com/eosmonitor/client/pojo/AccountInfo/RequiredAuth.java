package com.eosmonitor.client.pojo.AccountInfo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequiredAuth {
    @SerializedName("accounts")
    @Expose
    private List<Object> accounts = null;
    @SerializedName("keys")
    @Expose
    private List<Key> keys = null;
    @SerializedName("threshold")
    @Expose
    private Integer threshold;
    @SerializedName("waits")
    @Expose
    private List<Object> waits = null;

    public List<Object> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Object> accounts) {
        this.accounts = accounts;
    }

    public List<Key> getKeys() {
        return keys;
    }

    public void setKeys(List<Key> keys) {
        this.keys = keys;
    }

    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public List<Object> getWaits() {
        return waits;
    }

    public void setWaits(List<Object> waits) {
        this.waits = waits;
    }
}
