package com.eosmonitor.client.pojo.TransactionActions;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Action {
    @SerializedName("action_num")
    @Expose
    private Integer actionNum;
    @SerializedName("authorization")
    @Expose
    private List<Authorization> authorization = null;
    @SerializedName("data")
    @Expose
    private Map<String, Object> data;
    @SerializedName("expiration")
    @Expose
    private Integer expiration;
    @SerializedName("handler_account")
    @Expose
    private String handlerAccount;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("trx_id")
    @Expose
    private String trxId;

    public Integer getActionNum() {
        return actionNum;
    }

    public void setActionNum(Integer actionNum) {
        this.actionNum = actionNum;
    }

    public List<Authorization> getAuthorization() {
        return authorization;
    }

    public void setAuthorization(List<Authorization> authorization) {
        this.authorization = authorization;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public Integer getExpiration() {
        return expiration;
    }

    public void setExpiration(Integer expiration) {
        this.expiration = expiration;
    }

    public String getHandlerAccount() {
        return handlerAccount;
    }

    public void setHandlerAccount(String handlerAccount) {
        this.handlerAccount = handlerAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrxId() {
        return trxId;
    }

    public void setTrxId(String trxId) {
        this.trxId = trxId;
    }
}
