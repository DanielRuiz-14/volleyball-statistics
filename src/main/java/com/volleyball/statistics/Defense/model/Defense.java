package com.volleyball.statistics.Defense.model;

import com.volleyball.statistics.BasicStats.model.BasicStat;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
@Table(name = "defense")
@Entity
public class Defense extends BasicStat {
}
