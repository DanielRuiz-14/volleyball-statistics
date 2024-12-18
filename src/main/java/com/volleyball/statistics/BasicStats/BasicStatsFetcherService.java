package com.volleyball.statistics.BasicStats;

import com.volleyball.statistics.BasicStats.dto.BasicStatsDto;
import com.volleyball.statistics.BasicStats.dto.GeneralStatsDto;
import com.volleyball.statistics.BasicStats.model.Action;
import com.volleyball.statistics.BasicStats.model.BasicStat;
import com.volleyball.statistics.GamePlayer.GamePlayerRepository;
import com.volleyball.statistics.GamePlayer.model.GamePlayer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BasicStatsFetcherService {

    private final GamePlayerRepository gamePlayerRepository;
    private final BasicStatRepositoryFactory basicStatRepositoryFactory;

    public GeneralStatsDto getStatsByPlayer(String playerId) {

        //TODO: I have to sinchronize the database information to be consistent
        List<String> gamePlayerIds = gamePlayerRepository.findByPlayer(playerId)
                .stream().map(GamePlayer::getIdGamePlayer)
                .toList();


        return GeneralStatsDto.builder()
                .attack(getBasicStatsByPlayerAndAction(gamePlayerIds, Action.ATTACK))
                .defense(getBasicStatsByPlayerAndAction(gamePlayerIds, Action.DEFENSE))
                .reception(getBasicStatsByPlayerAndAction(gamePlayerIds, Action.RECEPTION))
                .serve(getBasicStatsByPlayerAndAction(gamePlayerIds, Action.SERVE))
                .block(getBasicStatsByPlayerAndAction(gamePlayerIds, Action.BLOCK))
                .build();
    }

    private BasicStatsDto getBasicStatsByPlayerAndAction(List<String> gamePlayerIds, Action action) {
        // TODO: Can I do it by summing all the values directly in the database??
        List<? extends BasicStat> statsList = basicStatRepositoryFactory.getRepository(action).findByIdGamePlayerIn(gamePlayerIds);
        return BasicStatsDto.builder()
                .doublePositive(statsList.stream().mapToInt(BasicStat::getDoublePositive).sum())
                .doubleNegative(statsList.stream().mapToInt(BasicStat::getDoubleNegative).sum())
                .negative(statsList.stream().mapToInt(BasicStat::getNegative).sum())
                .positive(statsList.stream().mapToInt(BasicStat::getPositive).sum())
                .build();

    }

}

