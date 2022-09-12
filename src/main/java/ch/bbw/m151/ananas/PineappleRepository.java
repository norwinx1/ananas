package ch.bbw.m151.ananas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PineappleRepository extends JpaRepository<PineappleEntity, Integer> {
    List<PineappleEntity> findAllByTypeEqualsAndQualityEquals(String type, Integer quality);

    void deleteByIdEquals(Integer id);

}
