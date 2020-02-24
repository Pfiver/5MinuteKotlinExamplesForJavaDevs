package ch.petikoch.examples.five_min_kotlin_for_java_devs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CashBalanceTest {

    @Test
    void testEquals() {

        // arrange
        var cb1 = new CashBalance("1.0");
        var cb2 = new CashBalance("1.000");

        // act
        var actual = cb1.equals(cb2);

        // assert
        assertThat(actual).isFalse(); // !
    }

    @Test
    void testIsSame() {

        // arrange
        var cb1 = new CashBalance("1.0");
        var cb2 = new CashBalance("1.000");

        // act
        var actual = cb1.isSame(cb2);

        // assert
        assertThat(actual).isTrue();
    }
}
