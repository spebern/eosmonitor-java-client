package com.eosmonitor.client.pojo.AccountInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Permission {
    @SerializedName("parent")
    @Expose
    private String parent;
    @SerializedName("perm_name")
    @Expose
    private String permName;
    @SerializedName("required_auth")
    @Expose
    private RequiredAuth requiredAuth;

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getPermName() {
        return permName;
    }

    public void setPermName(String permName) {
        this.permName = permName;
    }

    public RequiredAuth getRequiredAuth() {
        return requiredAuth;
    }

    public void setRequiredAuth(RequiredAuth requiredAuth) {
        this.requiredAuth = requiredAuth;
    }
}
