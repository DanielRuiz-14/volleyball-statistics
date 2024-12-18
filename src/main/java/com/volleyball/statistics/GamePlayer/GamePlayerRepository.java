package com.volleyball.statistics.GamePlayer;

import com.volleyball.statistics.GamePlayer.model.GamePlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GamePlayerRepository extends JpaRepository<GamePlayer, String> {


    List<GamePlayer> findByPlayer(String player);
}
