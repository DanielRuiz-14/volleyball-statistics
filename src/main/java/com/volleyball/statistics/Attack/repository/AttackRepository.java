package com.volleyball.statistics.Attack.repository;

import com.volleyball.statistics.Attack.model.Attack;
import com.volleyball.statistics.BasicStats.BasicStatRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttackRepository extends BasicStatRepository<Attack>, JpaRepository<Attack, String> {

    List<Attack> findByIdGamePlayerIn(List<String> idGamePlayer);
}
