package ch.petikoch.examples.five_min_kotlin_for_java_devs;

import java.math.BigDecimal;

public record CashBalance(BigDecimal amount) {

    public CashBalance(String amount) {
        this(new BigDecimal(amount));
    }

    // equals() könnte man auch überschreiben,
    // aber ich habe nicht genug Zeit, mir zu überlegen, ob ich das wirklich tun will.
    public boolean isSame(CashBalance other) {
        return amount.compareTo(other.amount) == 0;
    }
}
