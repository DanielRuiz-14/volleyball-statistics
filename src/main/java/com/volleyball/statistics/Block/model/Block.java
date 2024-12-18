package com.volleyball.statistics.Block.model;

import com.volleyball.statistics.BasicStats.model.BasicStat;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
@Table(name = "block")
@Entity
public class Block extends BasicStat {
}
