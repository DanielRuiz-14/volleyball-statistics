package com.volleyball.statistics.BasicStats.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class BasicStat {

    @Id
    private String id;

    // TODO: use UUID
    @Column(name = "id_game_player")
    private String idGamePlayer;

    @Column(name = "double_positive")
    private Integer doublePositive;

    @Column(name = "positive")
    private Integer positive;

    @Column(name = "negative")
    private Integer negative;

    @Column(name = "double_negative")
    private Integer doubleNegative;
}
