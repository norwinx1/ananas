package ch.bbw.m151.ananas;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Pageable;

@SpringBootTest
class AnanasApplicationTests implements WithAssertions {
    @Autowired
    private PineappleRepository pineappleRepository;

    @Test
    void testFindAllByTypeEqualsAndQualityEquals() {
        assertThat(pineappleRepository.findAllByTypeEqualsAndQualityEquals("Queens-Ananas", 1).size()).isEqualTo(25);
    }

    @Test
    void testFindAll() {
        assertThat(pineappleRepository.findAll(Pageable.ofSize(10)).getContent().size()).isEqualTo(10);
    }

    @Test
    void testDeleteById() {
        pineappleRepository.deleteByIdEquals(10);
        assertThat(pineappleRepository.count()).isEqualTo(999);
    }
}
