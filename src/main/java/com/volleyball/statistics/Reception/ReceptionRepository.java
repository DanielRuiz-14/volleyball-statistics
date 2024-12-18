package com.volleyball.statistics.Reception;

import com.volleyball.statistics.BasicStats.BasicStatRepository;
import com.volleyball.statistics.Reception.model.Reception;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReceptionRepository extends BasicStatRepository<Reception>, JpaRepository<Reception, String> {
    List<Reception> findByIdGamePlayerIn(List<String> idGamePlayer);
}
