package com.volleyball.statistics.BasicStats.dto;

import lombok.Builder;

@Builder
public record GeneralStatsDto(
        BasicStatsDto attack,
        BasicStatsDto defense,
        BasicStatsDto serve,
        BasicStatsDto reception,
        BasicStatsDto block
) {
}
