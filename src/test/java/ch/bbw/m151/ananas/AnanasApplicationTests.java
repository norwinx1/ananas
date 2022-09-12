package ch.bbw.m151.ananas;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AnanasApplicationTests implements WithAssertions {
    @Autowired
    private PineappleRepository pineappleRepository;

    @Test
    void testFindAllByTypeEqualsAndQualityEquals() {
        assertThat(pineappleRepository.findAllByTypeEqualsAndQualityEquals("Queens-Ananas", 1).size()).isEqualTo(25);
    }
}
