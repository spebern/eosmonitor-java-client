package com.eosmonitor.client.pojo.TransactionActions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Authorization {
    @SerializedName("actor")
    @Expose
    private String actor;
    @SerializedName("permission")
    @Expose
    private String permission;

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
