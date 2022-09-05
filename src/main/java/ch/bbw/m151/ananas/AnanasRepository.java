package ch.bbw.m151.ananas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnanasRepository extends JpaRepository<AnanasEntity, Integer> {

}
