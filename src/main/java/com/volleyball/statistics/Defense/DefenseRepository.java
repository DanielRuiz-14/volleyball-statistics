package com.volleyball.statistics.Defense;

import com.volleyball.statistics.BasicStats.BasicStatRepository;
import com.volleyball.statistics.Defense.model.Defense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DefenseRepository extends BasicStatRepository<Defense>, JpaRepository<Defense, String> {

    List<Defense> findByIdGamePlayerIn(List<String> idGamePlayer);
}
