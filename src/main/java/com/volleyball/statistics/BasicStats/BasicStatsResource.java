package com.volleyball.statistics.BasicStats;

import com.volleyball.statistics.BasicStats.dto.GeneralStatsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("basic")
@RequiredArgsConstructor
public class BasicStatsResource {


    private final BasicStatsFetcherService basicStatsFetcherService;

    @GetMapping()
    @ResponseBody
    public GeneralStatsDto getStatsByPlayer(@RequestParam(name = "playerId") String playerId){
        return basicStatsFetcherService.getStatsByPlayer(playerId);
    }
}
