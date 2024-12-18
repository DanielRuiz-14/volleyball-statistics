package com.volleyball.statistics.BasicStats;

import com.volleyball.statistics.BasicStats.model.BasicStat;

import java.util.List;

public interface BasicStatRepository<T extends BasicStat> {

    List<T> findByIdGamePlayerIn(List<String> idGamePlayer);
}
