package ch.petikoch.examples.five_min_kotlin_for_java_devs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JavaMessageTest {

    @Test
    void testEquals() {

        // arrange
        var jm1 = new JavaMessage("Howdi");
        var jm2 = new JavaMessage("Howdi");

        // act
        var actual = jm1.equals(jm2);

        // assert
        assertThat(actual).isTrue();
    }
}
