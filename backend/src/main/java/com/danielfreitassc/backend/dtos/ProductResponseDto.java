package com.danielfreitassc.backend.dtos;

import java.math.BigDecimal;

public record ProductResponseDto(
    Long id,
    String name,
    BigDecimal price
) {
    
}
