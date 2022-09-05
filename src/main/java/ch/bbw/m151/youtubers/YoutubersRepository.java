package ch.bbw.m151.youtubers;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface YoutubersRepository extends JpaRepository<YoutubersEntity, Integer> {
    List<YoutubersEntity> findAllByAmountSubscribersGreaterThan(Long amountSubscribers);

    List<YoutubersEntity> findAllByCategoryEqualsIgnoreCaseOrderByUsername(String category);

    List<YoutubersEntity> findAllByUsernameContainingOrderByUsername(String username, Pageable pageable);

    @Query("SELECT DISTINCT country FROM YoutubersEntity WHERE country IS NOT NULL")
    List<String> distinctCountries();
}
