package com.eosmonitor.client.pojo.TransactionActions;

import com.eosmonitor.client.pojo.ErrorCode;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TransactionActions {
    @SerializedName("code")
    @Expose
    private ErrorCode code;
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("error")
    @Expose
    private Object error;
    @SerializedName("message")
    @Expose
    private String message;

    public ErrorCode getCode() {
        return code;
    }

    public void setCode(ErrorCode code) {
        this.code = code;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
