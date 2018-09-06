package com.eosmonitor.client;

import com.eosmonitor.client.pojo.AccountInfo.AccountInfo;
import com.eosmonitor.client.pojo.BlockInfo.BlockInfo;
import com.eosmonitor.client.pojo.TransactionActions.TransactionActions;
import com.eosmonitor.client.pojo.TransactionInfo.TransactionInfo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EosmonitorApiService {
    @GET("/v1/accounts/{account_name}")
    Call<AccountInfo> getAccountInfo(@Path("account_name") String accountName);

    @GET("/v1/blocks/{block_num_or_id}")
    Call<BlockInfo> getBlockInfo(@Path("block_num_or_id") String blockNumOrId);

    @GET("/v1/transactions/{transaction_id}")
    Call<TransactionInfo> getTransactionInfo(@Path("transaction_id") String transactionId);

    @GET("/v1/transactions/{transaction_id}/actions")
    Call<TransactionActions> getTransactionActions(
            @Path("transaction_id") String transactionId,
            @Query("page") Integer page,
            @Query("per_page")  Integer perPage);

    @GET("/v1/actions")
    Call<TransactionActions> getActions(
            @Query("account") String accountName,
            @Query("name") String actionName,
            @Query("page") Integer page,
            @Query("per_page") Integer perPage );
}
