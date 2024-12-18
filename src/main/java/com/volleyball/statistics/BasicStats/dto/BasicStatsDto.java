package com.volleyball.statistics.BasicStats.dto;

import lombok.Builder;

@Builder
public record BasicStatsDto(
        Integer doublePositive,
        Integer positive,
        Integer negative,
        Integer doubleNegative

) {
}
