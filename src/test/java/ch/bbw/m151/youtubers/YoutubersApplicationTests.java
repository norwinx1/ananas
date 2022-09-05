package ch.bbw.m151.youtubers;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Pageable;

import java.util.List;

@SpringBootTest
class YoutubersApplicationTests implements WithAssertions {

    @Autowired
    private YoutubersRepository youtubersRepository;

    @Test
    void testCount() {
        assertThat(youtubersRepository.count()).isEqualTo(1000);
    }

    @Test
    void test100MilChannels() {
        assertThat(youtubersRepository.findAllByAmountSubscribersGreaterThan(100000000L).size()).isEqualTo(3);
    }

    @Test
    void testSportsCategory() {
        List<YoutubersEntity> list = youtubersRepository.findAllByCategoryEqualsIgnoreCaseOrderByUsername("Sports");
        assertThat(list.size()).isEqualTo(8);
    }

    @Test
    void testUsernameWithA() {
        List<YoutubersEntity> list = youtubersRepository.findAllByUsernameContainingOrderByUsername("a", Pageable.ofSize(10));
		assertThat(list.size()).isEqualTo(10);
    }

    @Test
    void testDistinctCountry() {
        List<String> list = youtubersRepository.distinctCountries();
        assertThat(list.size()).isEqualTo(28);
    }
}
