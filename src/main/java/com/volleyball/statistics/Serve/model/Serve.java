package com.volleyball.statistics.Serve.model;

import com.volleyball.statistics.BasicStats.model.BasicStat;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
@Table(name = "serve")
@Entity
public class Serve extends BasicStat {

}
