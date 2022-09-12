package ch.bbw.m151.ananas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface PineappleRepository extends JpaRepository<PineappleEntity, Integer> {
    List<PineappleEntity> findAllByTypeEqualsAndQualityEquals(String type, Integer quality);

    @Transactional
    void deleteByIdEquals(Integer id);

    @Query("SELECT DISTINCT weight FROM PineappleEntity")
    List<Integer> getWeights();
}
