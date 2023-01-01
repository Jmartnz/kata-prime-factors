package org.jmartnz;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PrimeFactorsTest {

    @Test
    void testOne() {
        assertThat(PrimeFactors.generate(1)).isEqualTo(Collections.emptyList());
    }

    @Test
    void testTwo() {
        assertThat(PrimeFactors.generate(2)).isEqualTo(List.of(2));
    }
}