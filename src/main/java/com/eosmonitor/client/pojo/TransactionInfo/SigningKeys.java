package com.eosmonitor.client.pojo.TransactionInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SigningKeys {
    @SerializedName("0")
    @Expose
    private String _0;

    public String get0() {
        return _0;
    }

    public void set0(String _0) {
        this._0 = _0;
    }
}
