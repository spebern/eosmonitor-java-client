package com.eosmonitor.client.pojo.TransactionInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigInteger;
import java.util.List;

public class Data {
    @SerializedName("actions_count")
    @Expose
    private Integer actionsCount;
    @SerializedName("block_id")
    @Expose
    private String blockId;
    @SerializedName("block_num")
    @Expose
    private Integer blockNum;
    @SerializedName("delay_sec")
    @Expose
    private Integer delaySec;
    @SerializedName("expiration")
    @Expose
    private Integer expiration;
    @SerializedName("irreversible")
    @Expose
    private Boolean irreversible;
    @SerializedName("max_cpu_usage_ms")
    @Expose
    private Integer maxCpuUsageMs;
    @SerializedName("max_net_usage_words")
    @Expose
    private Integer maxNetUsageWords;
    @SerializedName("ref_block_num")
    @Expose
    private Integer refBlockNum;
    @SerializedName("ref_block_prefix")
    @Expose
    private BigInteger refBlockPrefix;
    @SerializedName("signatures")
    @Expose
    private List<String> signatures;
    @SerializedName("signing_keys")
    @Expose
    private List<String> signingKeys;
    @SerializedName("transaction_extensions")
    @Expose
    private List<Object> transactionExtensions;
    @SerializedName("transaction_id")
    @Expose
    private String transactionId;

    public Integer getActionsCount() {
        return actionsCount;
    }

    public void setActionsCount(Integer actionsCount) {
        this.actionsCount = actionsCount;
    }

    public String getBlockId() {
        return blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public Integer getBlockNum() {
        return blockNum;
    }

    public void setBlockNum(Integer blockNum) {
        this.blockNum = blockNum;
    }

    public Integer getDelaySec() {
        return delaySec;
    }

    public void setDelaySec(Integer delaySec) {
        this.delaySec = delaySec;
    }

    public Integer getExpiration() {
        return expiration;
    }

    public void setExpiration(Integer expiration) {
        this.expiration = expiration;
    }

    public Boolean getIrreversible() {
        return irreversible;
    }

    public void setIrreversible(Boolean irreversible) {
        this.irreversible = irreversible;
    }

    public Integer getMaxCpuUsageMs() {
        return maxCpuUsageMs;
    }

    public void setMaxCpuUsageMs(Integer maxCpuUsageMs) {
        this.maxCpuUsageMs = maxCpuUsageMs;
    }

    public Integer getMaxNetUsageWords() {
        return maxNetUsageWords;
    }

    public void setMaxNetUsageWords(Integer maxNetUsageWords) {
        this.maxNetUsageWords = maxNetUsageWords;
    }

    public Integer getRefBlockNum() {
        return refBlockNum;
    }

    public void setRefBlockNum(Integer refBlockNum) {
        this.refBlockNum = refBlockNum;
    }

    public BigInteger getRefBlockPrefix() {
        return refBlockPrefix;
    }

    public void setRefBlockPrefix(BigInteger refBlockPrefix) {
        this.refBlockPrefix = refBlockPrefix;
    }

    public List<String> getSignatures() {
        return signatures;
    }

    public void setSignatures(List<String> signatures) {
        this.signatures = signatures;
    }

    public List<String> getSigningKeys() {
        return signingKeys;
    }

    public void setSigningKeys(List<String> signingKeys) {
        this.signingKeys = signingKeys;
    }

    public List<Object> getTransactionExtensions() {
        return transactionExtensions;
    }

    public void setTransactionExtensions(List<Object> transactionExtensions) {
        this.transactionExtensions = transactionExtensions;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
