package com.volleyball.statistics.Attack.model;


import com.volleyball.statistics.BasicStats.model.BasicStat;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
@Table(name = "attack")
@Entity
public class Attack extends BasicStat {
}
