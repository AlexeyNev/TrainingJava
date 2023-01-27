package Test_in;

import java.math.BigDecimal;

public interface LedgerService {
    long createAccount(long accountId);

    void transferFounds(long from, long to, BigDecimal amount);

    BigDecimal getBalance(long accountId);
}
