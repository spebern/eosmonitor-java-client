package com.eosmonitor.client.pojo.BlockInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {
    @SerializedName("action_mroot")
    @Expose
    private String actionMroot;
    @SerializedName("bft_irreversible_blocknum")
    @Expose
    private Integer bftIrreversibleBlocknum;
    @SerializedName("block_id")
    @Expose
    private String blockId;
    @SerializedName("block_num")
    @Expose
    private Integer blockNum;
    @SerializedName("block_signing_key")
    @Expose
    private String blockSigningKey;
    @SerializedName("dpos_irreversible_blocknum")
    @Expose
    private Integer dposIrreversibleBlocknum;
    @SerializedName("dpos_proposed_irreversible_blocknum")
    @Expose
    private Integer dposProposedIrreversibleBlocknum;
    @SerializedName("irreversible")
    @Expose
    private Boolean irreversible;
    @SerializedName("pending_schedule_hash")
    @Expose
    private String pendingScheduleHash;
    @SerializedName("pending_schedule_lib_num")
    @Expose
    private Integer pendingScheduleLibNum;
    @SerializedName("previous_block_id")
    @Expose
    private String previousBlockId;
    @SerializedName("producer")
    @Expose
    private String producer;
    @SerializedName("producer_signature")
    @Expose
    private String producerSignature;
    @SerializedName("schedule_version")
    @Expose
    private Integer scheduleVersion;
    @SerializedName("timestamp")
    @Expose
    private Integer timestamp;
    @SerializedName("transaction_mroot")
    @Expose
    private String transactionMroot;
    @SerializedName("trx_count")
    @Expose
    private Integer trxCount;

    public String getActionMroot() {
        return actionMroot;
    }

    public void setActionMroot(String actionMroot) {
        this.actionMroot = actionMroot;
    }

    public Integer getBftIrreversibleBlocknum() {
        return bftIrreversibleBlocknum;
    }

    public void setBftIrreversibleBlocknum(Integer bftIrreversibleBlocknum) {
        this.bftIrreversibleBlocknum = bftIrreversibleBlocknum;
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

    public String getBlockSigningKey() {
        return blockSigningKey;
    }

    public void setBlockSigningKey(String blockSigningKey) {
        this.blockSigningKey = blockSigningKey;
    }

    public Integer getDposIrreversibleBlocknum() {
        return dposIrreversibleBlocknum;
    }

    public void setDposIrreversibleBlocknum(Integer dposIrreversibleBlocknum) {
        this.dposIrreversibleBlocknum = dposIrreversibleBlocknum;
    }

    public Integer getDposProposedIrreversibleBlocknum() {
        return dposProposedIrreversibleBlocknum;
    }

    public void setDposProposedIrreversibleBlocknum(Integer dposProposedIrreversibleBlocknum) {
        this.dposProposedIrreversibleBlocknum = dposProposedIrreversibleBlocknum;
    }

    public Boolean getIrreversible() {
        return irreversible;
    }

    public void setIrreversible(Boolean irreversible) {
        this.irreversible = irreversible;
    }

    public String getPendingScheduleHash() {
        return pendingScheduleHash;
    }

    public void setPendingScheduleHash(String pendingScheduleHash) {
        this.pendingScheduleHash = pendingScheduleHash;
    }

    public Integer getPendingScheduleLibNum() {
        return pendingScheduleLibNum;
    }

    public void setPendingScheduleLibNum(Integer pendingScheduleLibNum) {
        this.pendingScheduleLibNum = pendingScheduleLibNum;
    }

    public String getPreviousBlockId() {
        return previousBlockId;
    }

    public void setPreviousBlockId(String previousBlockId) {
        this.previousBlockId = previousBlockId;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProducerSignature() {
        return producerSignature;
    }

    public void setProducerSignature(String producerSignature) {
        this.producerSignature = producerSignature;
    }

    public Integer getScheduleVersion() {
        return scheduleVersion;
    }

    public void setScheduleVersion(Integer scheduleVersion) {
        this.scheduleVersion = scheduleVersion;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getTransactionMroot() {
        return transactionMroot;
    }

    public void setTransactionMroot(String transactionMroot) {
        this.transactionMroot = transactionMroot;
    }

    public Integer getTrxCount() {
        return trxCount;
    }

    public void setTrxCount(Integer trxCount) {
        this.trxCount = trxCount;
    }
}
