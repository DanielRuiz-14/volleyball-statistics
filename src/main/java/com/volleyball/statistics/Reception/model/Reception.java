package com.volleyball.statistics.Reception.model;

import com.volleyball.statistics.BasicStats.model.BasicStat;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
@Table(name = "reception")
@Entity
public class Reception extends BasicStat {
}
