package com.volleyball.statistics.Serve;

import com.volleyball.statistics.BasicStats.BasicStatRepository;
import com.volleyball.statistics.Serve.model.Serve;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServeRepository extends BasicStatRepository<Serve>, JpaRepository<Serve, String> {
    List<Serve> findByIdGamePlayerIn(List<String> idGamePlayer);
}
