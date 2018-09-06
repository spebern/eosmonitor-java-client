package com.eosmonitor.client;

import com.eosmonitor.client.pojo.AccountInfo.AccountInfo;
import com.eosmonitor.client.pojo.BlockInfo.BlockInfo;
import com.eosmonitor.client.pojo.TransactionActions.Action;
import com.eosmonitor.client.pojo.TransactionActions.TransactionActions;
import com.eosmonitor.client.pojo.TransactionInfo.TransactionInfo;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.IOException;

public class EosmonitorApiTest extends TestCase {
    private static EosmonitorApiService client;

    public EosmonitorApiTest(String testName) {
        super(testName);
        client = EosmonitorApiServiceGenerator.createService("http://api.coinmeta.cn");
    }

    public static Test suite() {
        return new TestSuite( EosmonitorApiTest.class );
    }

    public void testApp() {
        assertTrue( true );
    }

    public void testGetAccountInfo() throws IOException {
        AccountInfo accountInfo = client.getAccountInfo("huobideposit").execute().body();
        assertEquals("huobideposit", accountInfo.getData().getName());
        assertEquals("heztanrtgege", accountInfo.getData().getCreator());
    }

    public void testGetBlockInfo() throws IOException {
        // TODO: finish, currently retrieved json is broken
        // BlockInfo blockInfo = client.getBlockInfo("9559286").execute().body();
    }

    public void testGetTransactionInfo() throws IOException {
        String txId = "c5504cbbb70ce297cffc1bdd9a856e0497f3b64420bdae79063123b3ec3f5186";
        TransactionInfo txInfo = client.getTransactionInfo(txId).execute().body();
        assertEquals(
                "SIG_K1_JzL2sNqDSUetbzv5uQp8XwV2UwNY49Gvcd7kzVmX2bVAb4CTfPQJQjpGXp1XezgWQ4t38s7mmfjmYoeihT6RZcdzFqCUrr",
                txInfo.getData().getSignatures().get(0) );
        assertEquals(txId, txInfo.getData().getTransactionId());
        assertEquals(1, txInfo.getData().getActionsCount().intValue());
        assertEquals(2547, txInfo.getData().getRefBlockNum().intValue());
        assertEquals(2661908677L, txInfo.getData().getRefBlockPrefix().longValue());
        assertEquals(9440059, txInfo.getData().getBlockNum().intValue());
        assertEquals(1533410366, txInfo.getData().getExpiration().intValue());
        assertEquals(true, txInfo.getData().getIrreversible().booleanValue());
    }

    public void testGetTransactionActions() throws IOException {
        String txId = "c5504cbbb70ce297cffc1bdd9a856e0497f3b64420bdae79063123b3ec3f5186";
        TransactionActions txActions = client.getTransactionActions(txId, null, null).execute().body();
        assertEquals(1, txActions.getData().getTotal().intValue());
        assertEquals("transfer", txActions.getData().getActions().get(0).getName());
        assertEquals(txId, txActions.getData().getActions().get(0).getTrxId());
        assertEquals(2, txActions.getData().getActions().get(0).getActionNum().intValue());

        Action action = txActions.getData().getActions().get(0);
        assertEquals("eosio.token", action.getHandlerAccount());
        assertEquals(1533381566, action.getExpiration().intValue());
        assertEquals("gm2tkmbyguge", action.getData().get("from").toString());
        assertEquals("eoslaomaocom", action.getData().get("to").toString());
        assertEquals("0.0001 EOS", action.getData().get("quantity").toString());
        assertEquals("承接区块链空投广告，用于区块链项目·公众号·节点等推广。价格全网最低，150元可投放1万个EOS用户名，有需要的联系>微信：eosabcd",
                action.getData().get("memo").toString());
    }

    public void testGetActions() throws IOException {
        TransactionActions txActions = client.getActions("huobideposit", "transfer", null, null).execute().body();
        assertNotNull(txActions.getData().getTotal());
    }
}
