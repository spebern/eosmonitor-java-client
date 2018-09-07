package com.eosmonitor.client.pojo;

import com.google.gson.annotations.SerializedName;

public enum ErrorCode {
        @SerializedName("0")
        SUCCESS,

        // Token error or expired
        @SerializedName("1000")
        UNAUTHORIZED,

        // System error
        @SerializedName("1001")
        ERROR,

        @SerializedName("1002")
        REQUEST_EXCEEDED_LIMIT,

        @SerializedName("1007")
        INVALID_PARAMETERS,

        // Resource does not exist
        @SerializedName("1008")
        NOT_FOUND
}
