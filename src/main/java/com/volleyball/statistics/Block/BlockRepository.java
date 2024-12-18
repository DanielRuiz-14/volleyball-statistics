package com.volleyball.statistics.Block;

import com.volleyball.statistics.BasicStats.BasicStatRepository;
import com.volleyball.statistics.Block.model.Block;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlockRepository extends BasicStatRepository<Block>, JpaRepository<Block, String> {
    List<Block> findByIdGamePlayerIn(List<String> idGamePlayer);
}
