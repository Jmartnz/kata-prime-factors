package org.jmartnz;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

class PrimeFactorsTest {

    @Test
    void testOne() {
        assertThat(PrimeFactors.generate(1)).isEqualTo(Collections.emptyList());
    }
}