package com.volleyball.statistics.GamePlayer.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "game_player")
public class GamePlayer {

    @Id
    @GeneratedValue
    @Column(name = "id_game_player")
    private String idGamePlayer;

    private String game;

    private String player;

    private String team;
}
