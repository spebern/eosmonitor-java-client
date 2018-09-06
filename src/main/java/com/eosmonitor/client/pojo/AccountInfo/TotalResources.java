package com.eosmonitor.client.pojo.AccountInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TotalResources {
    @SerializedName("cpu_weight")
    @Expose
    private String cpuWeight;
    @SerializedName("net_weight")
    @Expose
    private String netWeight;
    @SerializedName("owner")
    @Expose
    private String owner;
    @SerializedName("ram_bytes")
    @Expose
    private Integer ramBytes;

    public String getCpuWeight() {
        return cpuWeight;
    }

    public void setCpuWeight(String cpuWeight) {
        this.cpuWeight = cpuWeight;
    }

    public String getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getRamBytes() {
        return ramBytes;
    }

    public void setRamBytes(Integer ramBytes) {
        this.ramBytes = ramBytes;
    }
}
