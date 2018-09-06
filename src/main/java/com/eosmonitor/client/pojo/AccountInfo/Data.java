package com.eosmonitor.client.pojo.AccountInfo;

import java.time.LocalDateTime;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {
    @SerializedName("cpu_limit")
    @Expose
    private CpuLimit cpuLimit;
    @SerializedName("cpu_weight")
    @Expose
    private Integer cpuWeight;
    @SerializedName("created")
    @Expose
    private LocalDateTime created;
    @SerializedName("creator")
    @Expose
    private String creator;
    @SerializedName("delegated_bandwidth")
    @Expose
    private DelegatedBandwidth delegatedBandwidth;
    @SerializedName("eos_balance")
    @Expose
    private Double eosBalance;
    @SerializedName("last_code_update")
    @Expose
    private LocalDateTime lastCodeUpdate;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("net_limit")
    @Expose
    private NetLimit netLimit;
    @SerializedName("net_weight")
    @Expose
    private Integer netWeight;
    @SerializedName("permissions")
    @Expose
    private List<Permission> permissions = null;
    @SerializedName("privileged")
    @Expose
    private Boolean privileged;
    @SerializedName("ram_quota")
    @Expose
    private Integer ramQuota;
    @SerializedName("ram_usage")
    @Expose
    private Integer ramUsage;
    @SerializedName("total_resources")
    @Expose
    private TotalResources totalResources;

    public CpuLimit getCpuLimit() {
        return cpuLimit;
    }

    public void setCpuLimit(CpuLimit cpuLimit) {
        this.cpuLimit = cpuLimit;
    }

    public Integer getCpuWeight() {
        return cpuWeight;
    }

    public void setCpuWeight(Integer cpuWeight) {
        this.cpuWeight = cpuWeight;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public DelegatedBandwidth getDelegatedBandwidth() {
        return delegatedBandwidth;
    }

    public void setDelegatedBandwidth(DelegatedBandwidth delegatedBandwidth) {
        this.delegatedBandwidth = delegatedBandwidth;
    }

    public Double getEosBalance() {
        return eosBalance;
    }

    public void setEosBalance(Double eosBalance) {
        this.eosBalance = eosBalance;
    }

    public LocalDateTime getLastCodeUpdate() {
        return lastCodeUpdate;
    }

    public void setLastCodeUpdate(LocalDateTime lastCodeUpdate) {
        this.lastCodeUpdate = lastCodeUpdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NetLimit getNetLimit() {
        return netLimit;
    }

    public void setNetLimit(NetLimit netLimit) {
        this.netLimit = netLimit;
    }

    public Integer getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(Integer netWeight) {
        this.netWeight = netWeight;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    public Integer getRamQuota() {
        return ramQuota;
    }

    public void setRamQuota(Integer ramQuota) {
        this.ramQuota = ramQuota;
    }

    public Integer getRamUsage() {
        return ramUsage;
    }

    public void setRamUsage(Integer ramUsage) {
        this.ramUsage = ramUsage;
    }

    public TotalResources getTotalResources() {
        return totalResources;
    }

    public void setTotalResources(TotalResources totalResources) {
        this.totalResources = totalResources;
    }
}
