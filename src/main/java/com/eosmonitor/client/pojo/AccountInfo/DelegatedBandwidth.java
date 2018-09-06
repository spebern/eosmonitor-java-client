package com.eosmonitor.client.pojo.AccountInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DelegatedBandwidth {
    @SerializedName("cpu_weight")
    @Expose
    private String cpuWeight;
    @SerializedName("from")
    @Expose
    private String from;
    @SerializedName("net_weight")
    @Expose
    private String netWeight;
    @SerializedName("to")
    @Expose
    private String to;

    public String getCpuWeight() {
        return cpuWeight;
    }

    public void setCpuWeight(String cpuWeight) {
        this.cpuWeight = cpuWeight;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
