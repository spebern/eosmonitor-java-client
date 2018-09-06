<!-- markdown-toc start - Don't edit this section. Run M-x markdown-toc-refresh-toc -->
**Table of Contents**

- [EOSMonitor-API client in Java](#eosmonitor-api-client-in-java)
    - [Usage (synchronous requests):](#usage-synchronous-requests)

<!-- markdown-toc end -->

# EOSMonitor-API client in Java

Simple client for consuming https://github.com/eostea/eosmonitor-api

This library is a very thin wrapper, so when using you decide if you want
it an async or sync way.

## Usage (synchronous requests):

``` java
EosmonitorApiService client = EosmonitorApiServiceGenerator.createService("http://api.coinmeta.cn");

AccountInfo accountInfo = client.getAccountInfo("huobideposit").execute().body();

String txId = "c5504cbbb70ce297cffc1bdd9a856e0497f3b64420bdae79063123b3ec3f5186";

TransactionInfo txInfo = client.getTransactionInfo(txId).execute().body();
    
TransactionActions txActions = client.getTransactionActions(txId, 1, 10).execute().body();

TransactionActions txActions = client.getActions("huobideposit", "transfer", 1, 10).execute().body();
```
