package com.volleyball.statistics.BasicStats;

import com.volleyball.statistics.Attack.repository.AttackRepository;
import com.volleyball.statistics.BasicStats.model.Action;
import com.volleyball.statistics.Block.BlockRepository;
import com.volleyball.statistics.Defense.DefenseRepository;
import com.volleyball.statistics.Reception.ReceptionRepository;
import com.volleyball.statistics.Serve.ServeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BasicStatRepositoryFactory {

    private final AttackRepository attackRepository;
    private final DefenseRepository defenseRepository;
    private final ServeRepository serveRepository;
    private final BlockRepository blockRepository;
    private final ReceptionRepository receptionRepository;

    public BasicStatRepository<?> getRepository(Action action) {
        switch (action) {
            case ATTACK -> {
                return attackRepository;
            }
            case DEFENSE -> {
                return defenseRepository;
            }
            case SERVE -> {
                return serveRepository;
            }
            case BLOCK -> {
                return blockRepository;
            }
            case RECEPTION -> {
                return receptionRepository;
            }
            default -> {
                throw new IllegalArgumentException("Invalid action");
            }

        }
    }

}
